package launch_browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Login {

	public static void main(String[] args)
	{
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
     driver.findElement(By.name("google-register")).click();
     Set<String> id = driver.getWindowHandles();
     Iterator<String> id1 = id.iterator();
     String pid = id1.next();
     String cid = id1.next();
     driver.switchTo().window(cid);
     driver.findElement(By.id("identifierId")).sendKeys("ashritha030@gmail.com");
     driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
     
	}
}
