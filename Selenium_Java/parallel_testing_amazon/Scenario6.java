package parallel_testing_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario6 extends LaunchnQuit
{
 @Test
 public void searching6()
 {
     driver.findElement(By.linkText("Electronics")).click();
     driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[10]")).click();		
 }
}
