package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Handling {

	public static void main(String[] args)
	{
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://grotechminds.com/javascript-popup/");
     driver.switchTo().alert().accept();
     driver.findElement(By.xpath("//button[@class='btnjs']")).click();
     
	}

}
