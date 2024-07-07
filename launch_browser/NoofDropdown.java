package launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoofDropdown {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		
		WebElement demo1 = driver.findElement(By.id("Choice1"));
		Select s1 = new Select(demo1);
		s1.selectByVisibleText("Demo2");
		List<WebElement> count = s1.getOptions();
		System.out.println(count.size());
	}

}
