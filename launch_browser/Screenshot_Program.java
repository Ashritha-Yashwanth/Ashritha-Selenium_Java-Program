package launch_browser;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Program {

	public static void main(String[] args) throws IOException, InterruptedException
	{
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com");
      WebElement e1 = driver.findElement(By.name("q"));
      e1.sendKeys("Ooty");
      e1.sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      Date d1 = new Date();
      Date d2 = new Date(d1.getTime());
      String date = d2.toString();
      String date1 = date.replace(":","_");
      System.out.println(date1);
      
      
      TakesScreenshot a1 = driver;
      File source = a1.getScreenshotAs(OutputType.FILE);
      File destination = new File("C:\\Users\\USER\\Desktop\\Screenshot_Automation\\Ashritha".concat(date1)+".png");
      FileHandler.copy(source, destination);
	}

}
