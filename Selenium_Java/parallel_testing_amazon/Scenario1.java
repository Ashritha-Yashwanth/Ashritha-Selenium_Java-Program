package parallel_testing_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1 extends LaunchnQuit
{
   @Test
   public void searching1()
   {
	     WebElement s1 =  driver.findElement(By.id("twotabsearchtextbox"));
	     s1.sendKeys("shoes");
	     s1.sendKeys(Keys.ENTER);
	     driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
   }
}
