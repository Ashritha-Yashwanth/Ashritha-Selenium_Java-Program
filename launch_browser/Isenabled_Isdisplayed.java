package launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled_Isdisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
     WebElement search = driver.findElement(By.name("q"));
      if(search.isDisplayed() && search.isEnabled())
      {
    	  search.sendKeys("India");
    	  Thread.sleep(2000);
      }
     List<WebElement> auto_suggestion  = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
     int count = auto_suggestion.size();
     System.out.println(count);
     auto_suggestion.get(4).click();
	}

}
