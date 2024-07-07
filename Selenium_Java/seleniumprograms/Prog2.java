package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prog2 
{
	@Test
    public static void searching() throws InterruptedException
    {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		 WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("ashritha030@gmail.com");
        WebElement un_continue = driver.findElement(By.id("continue"));
        un_continue.click();
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Ashu1234");
       WebElement signin_button = driver.findElement(By.id("signInSubmit"));
       signin_button.click();
		
       
       WebElement d1 = driver.findElement(By.id("twotabsearchtextbox"));
       d1.sendKeys("shoes");
       d1.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       
    	
    }
	
}
