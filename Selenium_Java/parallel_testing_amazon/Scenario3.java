package parallel_testing_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario3 extends LaunchnQuit
{
 @Test
 public void searching3()
 {
     WebElement s1 =  driver.findElement(By.id("twotabsearchtextbox"));
     s1.sendKeys("mouse");
     s1.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
     driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
 }
}
