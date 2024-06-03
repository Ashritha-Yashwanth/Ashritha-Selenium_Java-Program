package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank_Login {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.className("login_button")).click();
		driver.findElement(By.id("username")).sendKeys("Ashritha");
		driver.findElement(By.id("label2")).sendKeys("test123");
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("WRTUN");
	}

}
