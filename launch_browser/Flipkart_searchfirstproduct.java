package launch_browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_searchfirstproduct {

	public static void main(String[] args)
	{
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
     // driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("shoes"); //css syntax3 with help of classname
      WebElement s1 = driver.findElement(By.name("q"));
      s1.sendKeys("shoes");
      s1.sendKeys(Keys.ENTER);
      driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[1]")).click();
      Set<String> s2 = driver.getWindowHandles();
      System.out.println(s2);
      
      Iterator<String> pcid = s2.iterator();
      String parentid = pcid.next();
      String childid = pcid.next();
      System.out.println(parentid);
      System.out.println(childid);
      
      
    	  
	}

}
