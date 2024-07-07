package assertionEx12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_12 
{
  @Test
  public void test() throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement search =  driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("shoes");
	    search.sendKeys(Keys.ENTER);
	    driver.navigate().back();
	    
	    WebElement s2 =  driver.findElement(By.id("twotabsearchtextbox"));
	     Assert.assertEquals(s2.isDisplayed(),true,"failed");
  }
}
