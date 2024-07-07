package parallel_testing_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario10 extends LaunchnQuit
{
 @Test
 public void searching10()
 {
    WebElement search =  driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("shoes");
    search.sendKeys(Keys.ENTER);
    driver.navigate().back();
 }
}
