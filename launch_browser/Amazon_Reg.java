package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Reg {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
		driver.findElement(By.id("ap_customer_name")).sendKeys("ashritha030@gmail.com");
		driver.findElement(By.id("ap_phone_number")).sendKeys("8904617042");
		driver.findElement(By.id("ap_password")).sendKeys("Sush1234!");
		driver.findElement(By.id("continue")).click();
	}

}
