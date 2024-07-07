package assertionEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchIndiaEx 
{
	@Test
	public void testcase1() throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("india");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(500);
	Assert.assertEquals(driver.getTitle(), "india - Google Search" ,"sorry it is failed");
}
}
