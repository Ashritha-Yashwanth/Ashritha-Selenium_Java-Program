package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
    WebElement d1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/span/span[1]"));
    Actions a1=new Actions(driver);
    a1.moveToElement(d1).perform();
    Thread.sleep(2000);
    WebElement d2= driver.findElement(By.linkText("Men's T-Shirts"));
    d2.click();
   
     
	}

}
