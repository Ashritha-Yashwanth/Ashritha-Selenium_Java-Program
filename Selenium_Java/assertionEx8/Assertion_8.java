package assertionEx8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_8 
 {
 @Test
 public void testcase() throws InterruptedException
 {
	 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.linkText("Electronics")).click();
	   driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[6]")).click();
	   Thread.sleep(500);
	   WebElement s2 =  driver.findElement(By.id("twotabsearchtextbox"));
	     Assert.assertEquals(s2.isDisplayed(),true,"failed");
 }
}
