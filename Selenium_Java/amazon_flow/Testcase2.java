package amazon_flow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase2 extends LaunchnQuit
{
	@Test
   public  void AddToCart() throws InterruptedException
   {
	
   
   WebElement d1 = driver.findElement(By.id("twotabsearchtextbox"));
   d1.sendKeys("shoes");
   d1.sendKeys(Keys.ENTER);
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
   Set<String> id = driver.getWindowHandles();
   System.out.println(id);
   Iterator<String> id1 = id.iterator();
   String pid = id1.next();
   String cid =  id1.next();
   System.out.println(pid);
   System.out.println(cid);
   driver.switchTo().window(cid);     
   
   
  WebElement addtowishlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
   addtowishlist.click();
   Thread.sleep(2000);  
   
   WebElement viewyourlist = driver.findElement(By.linkText("View Your List"));
   viewyourlist.click();
   
   WebElement addtocart = driver.findElement(By.xpath("(//a[@class='a-button-text a-text-center'])[1]"));
   addtocart.click();
   
    
}
}
