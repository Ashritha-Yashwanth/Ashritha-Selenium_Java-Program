package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsearch_Relativexpath {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search = driver.findElement(By.xpath("(//input)[5]"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
	}

}
