package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Program {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement demo1 = driver.findElement(By.id("Choice1"));
		Select s1 = new Select(demo1);
		s1.selectByVisibleText("Demo2");
		
		WebElement demo2 = driver.findElement(By.id("Choice9"));
		Select s2 = new Select(demo2);
		s2.selectByValue("SQL15");
		
		WebElement demo3 = driver.findElement(By.id("Choice6"));
		Select s3 = new Select(demo3);
		s3.selectByValue("Night10");
		
		WebElement demo4 = driver.findElement(By.id("Choice4"));
		Select s4 = new Select(demo4);
		s4.selectByVisibleText("Energy15");
		s4.selectByVisibleText("Energy14");
		s4.selectByVisibleText("Energy13");
		s4.selectByVisibleText("Energy12");
		s4.selectByVisibleText("Energy11");

		
		WebElement demo5 = driver.findElement(By.id("Choice8"));
		Select s5 = new Select(demo5);
		s5.selectByVisibleText("QTP6");
		s5.selectByVisibleText("QTP7");
		s5.selectByVisibleText("QTP8");
		s5.selectByVisibleText("QTP9");
		s5.selectByVisibleText("QTP10");
		
		
	}

}
