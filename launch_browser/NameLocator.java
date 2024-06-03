package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.name("field-keywords")).sendKeys("1 year old baby girl dress");
		driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);

	}

}
