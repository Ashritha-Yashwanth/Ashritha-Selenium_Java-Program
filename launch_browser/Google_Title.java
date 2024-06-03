package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Title {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.findElement(By.cssSelector("textarea[id^='APj']")).sendKeys("What is java");// css with help of substring
		//driver.findElement(By.cssSelector("textarea.gLFyf[id='APjFqb']")).sendKeys("Chitradurga"); // css with TN,CN,AN & AV
		//driver.findElement(By.cssSelector("textarea[id='APjFqb']")).sendKeys("Hassan");//css with TN,AN & AV
		//driver.findElement(By.cssSelector("[id='APjFqb']")).sendKeys("Mysore"); //css with AN & AV
		//driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("Tumkur");// css with help of TN & CN
		// driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Bangalore");// css syntax 2 help of TN & id
		//driver.findElement(By.cssSelector("#APjFqb")).sendKeys("india");//1 css syntax 1 help of id
		driver.findElement(By.name("q")).sendKeys("India");//name value is q by inspecting in search bar ,here finding the element and locating is done.performed action
		//driver.findElement(By.name("btnK")).click();//google search button 1 method
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //keyboard enter

	}

	
}
