package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Documents/learningHTML1.html");
		WebElement un = driver.findElement(By.xpath("(html/body/input)[1]"));
		un.sendKeys("AshrithaYashwanth");
		WebElement hint = driver.findElement(By.xpath("(html/body/input)[2]"));
		hint.sendKeys("my name");
		WebElement password = driver.findElement(By.xpath("(html/body/input)[3]"));
		password.sendKeys("qwer123");
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Ashritha");
		WebElement checkbox1 = driver.findElement(By.id("123"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.name("name2"));
        checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.id("321"));
		checkbox3.click();
		WebElement gender1 = driver.findElement(By.xpath("(html/body/input)[4]"));
		gender1.click();
		WebElement gender2 = driver.findElement(By.xpath("(html/body/input)[5]"));
		gender2.click();
		WebElement relocate = driver.findElement(By.xpath("(html/body/input)[6]"));
		relocate.click();
		WebElement signup = driver.findElement(By.xpath("(html/body/input)[7]"));
		signup.click();
		
		
		
		
	}

}
