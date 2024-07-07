package parallel_testing_amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.manage().window().maximize();
		     driver.get("https://www.amazon.in/");
	  }

}
