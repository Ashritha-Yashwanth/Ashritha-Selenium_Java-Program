package parallel_program_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1 extends LaunchnQuit
{
	@Test
	public  void AddToCart() throws InterruptedException
	{
   
		 WebElement d1 = driver.findElement(By.id("test"));
  // WebElement d1 = driver.findElement(By.id("twotabsearchtextbox"));
   d1.sendKeys("shoes");
   d1.sendKeys(Keys.ENTER);
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
   
   
	}	
	
}
