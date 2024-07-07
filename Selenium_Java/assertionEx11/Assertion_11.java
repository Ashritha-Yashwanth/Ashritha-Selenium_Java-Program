package assertionEx11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_11
{
  @Test
  public void test()
  {
	  
	  ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	     driver.findElement(By.linkText("Today's Deals")).click();
	     driver.findElement(By.xpath("(//li[@role='listitem'])[2]")).click();
	     driver.findElement(By.xpath("(//a[@class='a-color-base a-link-normal a-text-normal'])[1]")).click();
	     
	     WebElement s2 =  driver.findElement(By.id("twotabsearchtextbox"));
	     Assert.assertEquals(s2.isDisplayed(),true,"failed");
  }
}
