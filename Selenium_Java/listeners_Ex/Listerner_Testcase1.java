package listeners_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Test.class)
public class Listerner_Testcase1 extends Listeners_Test
{
	
	@Test
	public static void searching()
	{
	 driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
   // WebElement s1 =  driver.findElement(By.id("testtwotabsearchtextbox"));
    WebElement s1 =  driver.findElement(By.id("twotabsearchtextbox"));
    s1.sendKeys("shoes");
    s1.sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
	} 
}
