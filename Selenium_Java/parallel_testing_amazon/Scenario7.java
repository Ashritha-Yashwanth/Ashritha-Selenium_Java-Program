package parallel_testing_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scenario7 extends LaunchnQuit
{
    @Test
	public void searching7()
	{
        WebElement dd = driver.findElement(By.id("searchDropdownBox"));
        Select s1 = new Select(dd);
        s1.selectByVisibleText("Amazon Fresh");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("mango");
        search.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();
	}
}

