package launch_browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_AddtoCart {

	public static void main(String[] args)
	{
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
      WebElement d1 = driver.findElement(By.id("twotabsearchtextbox"));
      d1.sendKeys("shoes");
      d1.sendKeys(Keys.ENTER);
      driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
      Set<String> id = driver.getWindowHandles();
      System.out.println(id);
      Iterator<String> id1 = id.iterator();
      String pid = id1.next();
      String cid =  id1.next();
      driver.switchTo().window(cid);
      driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized")).click();
      driver.findElement(By.id("ap_email")).sendKeys("ashritha030@gmail.com");
      driver.findElement(By.id("continue")).click();
      driver.findElement(By.id("ap_password")).sendKeys("Ashu1234");
      driver.findElement(By.id("signInSubmit")).click();
      
      driver.findElement(By.id("add-to-cart-button")).click();
      driver.findElement(By.className("a-button-input")).click();
      
      WebElement  accountandlist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		driver.findElement(By.xpath("(//span[@class='nav-text'])[21]")).click();
	}

}
