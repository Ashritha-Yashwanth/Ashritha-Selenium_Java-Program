package iRetry;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1
{
   @Test(retryAnalyzer=iRetry.Retry_Logic.class)
   public void method()
   {
	   ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement s1 =  driver.findElement(By.id("testtwotabsearchtextbox"));
      //WebElement s1 =  driver.findElement(By.id("twotabsearchtextbox"));
     s1.sendKeys("shoes");
     s1.sendKeys(Keys.ENTER);
     WebElement s2=  driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
     s2.click();
  
      Set<String> parentChildId = driver.getWindowHandles();
      Assert.assertEquals(parentChildId.size(),2,"test case failed");
   
   }
}
