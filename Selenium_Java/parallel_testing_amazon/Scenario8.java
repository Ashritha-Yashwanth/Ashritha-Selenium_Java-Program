package parallel_testing_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scenario8 extends LaunchnQuit
{
 @Test
 public void searching8()
 {
     WebElement dd = driver.findElement(By.id("searchDropdownBox"));
     Select s1 = new Select(dd);
     s1.selectByVisibleText("Books");
     WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
     search.sendKeys("power of mind");
     search.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
 }
}
