package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Reg {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Ashritha");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.name("reg_email__")).sendKeys("8904617042");
		driver.findElement(By.id("password_step_input")).sendKeys("test123");
		driver.findElement(By.name("websubmit")).click();
		
	}

}
