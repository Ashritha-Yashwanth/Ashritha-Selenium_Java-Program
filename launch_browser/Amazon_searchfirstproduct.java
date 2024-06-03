package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_searchfirstproduct {

	public static void main(String[] args)
	{
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
     WebElement signin = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
     Actions a1 = new Actions(driver);
     signin.click();
     driver.findElement(By.id("ap_email")).sendKeys("ashritha030@gmail.com");
     driver.findElement(By.id("continue")).click();
     driver.findElement(By.id("ap_password")).sendKeys("Ashu1234");
     driver.findElement(By.id("signInSubmit")).click();
     WebElement s1 =  driver.findElement(By.id("twotabsearchtextbox"));
     s1.sendKeys("shoes");
     s1.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
     
    
     
	}

}
