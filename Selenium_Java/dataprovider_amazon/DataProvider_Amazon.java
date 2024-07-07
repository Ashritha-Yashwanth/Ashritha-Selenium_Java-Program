package dataprovider_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider_Amazon
{
	@DataProvider(name ="login_details")
	public Object[][]method1()
	
	{
		Object d1[][]= new Object[5][2];
		//first person cred
		d1[0][0]="test1@gmail.com";
		d1[0][1]="wert";
		
		//second person cred
	    d1[1][0]="test2@gmail.com";
	    d1[1][1]="yoamj2";
	    
	  //third person cred
	    d1[2][0]="test3@gmail.com";
	    d1[2][1]="yoamj2";
	    
	  //fourth person cred
	    d1[3][0]="test4@gmail.com";
	    d1[3][1]="yoamj2";
	    
	  //fifth person cred
	    d1[4][0]="test5@gmail.com";
	    d1[4][1]="yoamj2";
	    return d1;
		
	}
	@Test(dataProvider="login_details")
	  public  void launch(String username,String pswd)
	  {
		ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			
			 WebElement un = driver.findElement(By.id("ap_email"));
			un.sendKeys(username);
		    WebElement un_continue = driver.findElement(By.id("continue"));
		    un_continue.click();
		    WebElement password = driver.findElement(By.name("password"));
		    password.sendKeys(pswd);
		   WebElement signin_button = driver.findElement(By.id("signInSubmit"));
		   signin_button.click();
		   
	  }

}
