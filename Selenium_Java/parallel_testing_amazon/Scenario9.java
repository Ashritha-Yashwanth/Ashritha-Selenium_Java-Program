package parallel_testing_amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario9 extends LaunchnQuit
{
 @Test
 public void searching9() 
 {
     driver.findElement(By.linkText("Today's Deals")).click();
     driver.findElement(By.className("Bubble-module__bubble_HMAsFLoooPgV9bEqZsLu")).click();
     driver.findElement(By.xpath("(//a[@class='a-color-base a-link-normal a-text-normal'])[1]")).click();
 }
}
