package parallel_testing_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario5 extends LaunchnQuit
{
  @Test
  public void searching5()
  {
	 
	   WebElement s1 =  driver.findElement(By.id("twotabsearchtextbox"));
	    s1.sendKeys("camera");
	    s1.sendKeys(Keys.ENTER);
	     driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[22]")).click();
  }
}
