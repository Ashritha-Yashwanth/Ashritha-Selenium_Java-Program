package parallel_testing_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario4 extends LaunchnQuit
{
 @Test
 public void searching4()
 {
     WebElement s1 =  driver.findElement(By.id("twotabsearchtextbox"));
     s1.sendKeys("mobile cover");
     s1.sendKeys(Keys.ENTER);
     driver.findElement(By.id("p_n_availability/1318485031")).click();
 }
}
