package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_GTM {

	public static void main(String[] args) throws InterruptedException
	{
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
     // driver.get("https://grotechminds.com/registeration-form/");
      driver.navigate().to("https://grotechminds.com/registeration-form/");
      driver.findElement(By.id("firstName")).sendKeys("Ashritha");
      driver.findElement(By.id("lastName")).sendKeys("S");
      driver.findElement(By.id("email")).sendKeys("ashritha030@gmail.com");
      driver.findElement(By.id("phone")).sendKeys("8904617042");
      WebElement dd1 = driver.findElement(By.id("gender"));
      Select s1 = new Select(dd1);
      s1.selectByValue("female");
      
      WebElement dd2 = driver.findElement(By.id("state"));
      Select s2 = new Select(dd2);
      s2.selectByVisibleText("Karnataka");
      
      driver.findElement(By.id("aadhaar")).sendKeys("456171838278");
      driver.findElement(By.id("pan")).sendKeys("SDFAG5646K");
      driver.findElement(By.id("terms")).click();
      Thread.sleep(2000);
      driver.navigate().refresh();
      //driver.findElement(By.name("Submit")).click();
      
      
	}

}
