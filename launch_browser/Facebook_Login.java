package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_Login {

	public static void main(String[] args)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("ashritha030@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("qed2rsscf");
		driver.findElement(By.name("login")).click();
	}

}
