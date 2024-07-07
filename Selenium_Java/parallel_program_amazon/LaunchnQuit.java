package parallel_program_amazon;

//import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchnQuit
{
	 WebDriver driver;
	  @BeforeMethod
	  @Parameters("browser")
	  public  void launch(String nameofbrowser)
	  {
		  if(nameofbrowser.equals("chrome"))
			{
				driver = new ChromeDriver(); //will launch chrome
			}
		  if(nameofbrowser.equals("firefox"))
			{
			 driver= new FirefoxDriver();  //will launch firefox	
			}
			if(nameofbrowser.equals("edge"))
			{
				driver = new EdgeDriver();//will launch edge
			}
			driver.manage().window().maximize();
			 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			
			 WebElement un = driver.findElement(By.id("ap_email"));
			un.sendKeys("ashritha030@gmail.com");
		    WebElement un_continue = driver.findElement(By.id("continue"));
		    un_continue.click();
		    WebElement password = driver.findElement(By.name("password"));
		    password.sendKeys("Ashu1234");
		   WebElement signin_button = driver.findElement(By.id("signInSubmit"));
		   signin_button.click();
	  }

	  @AfterMethod
	  public void quit() throws IOException
	  {
		/*  TakesScreenshot a2 = driver;
	      File source = a2.getScreenshotAs(OutputType.FILE);
	      File destination = new File("C:\\Users\\USER\\Desktop\\Screenshot_Automation\\Ashritha"+"shot"+Math.random()+".png");
	      FileHandler.copy(source, destination);*/
	      
		  WebElement  accountandlist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
			Actions a1 = new Actions(driver);
			a1.moveToElement(accountandlist).perform();
			
			driver.findElement(By.id("nav-item-signout")).click();
	  }
}
