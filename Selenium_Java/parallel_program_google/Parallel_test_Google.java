package parallel_program_google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_test_Google {
  WebDriver driver;
	@Test
	@Parameters("browser")
	 public  void testcase1(String nameofbrowser)
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
			driver = new EdgeDriver(); //will launch edge
		}
		driver.get("https://www.google.com");
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleContains("Goo"));
		driver.findElement(By.name("q")).sendKeys("india");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 }
}
