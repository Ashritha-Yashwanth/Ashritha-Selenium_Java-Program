package assertionEx1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Login
{
   @Test
   public void testcase1()
   {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement un = driver.findElement(By.id("ap_email"));
	un.sendKeys("ashritha030@gmail.com");
    WebElement un_continue = driver.findElement(By.id("continue"));
    un_continue.click();
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("Ashu1234");
   WebElement signin_button = driver.findElement(By.id("signInSubmit"));
   signin_button.click();
   
   WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
  // Assert.assertEquals(search.isDisplayed(), true,"test case fail");
   Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","sorry");
}
}
