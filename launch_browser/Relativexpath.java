package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Documents/learningHTML1.html");
		WebElement un = driver.findElement(By.xpath("(//input)[1]"));
		un.sendKeys("AshrithaYashwanth");
		WebElement hint = driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("My name");
		WebElement pswd = driver.findElement(By.xpath("(//input)[3]"));
		pswd.sendKeys("Ash123");
		WebElement fn = driver.findElement(By.xpath("(//input)[4]"));
		fn.sendKeys("Ashritha");
		WebElement checkbox1 = driver.findElement(By.xpath("(//input)[7]"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("(//input)[8]"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("(//input)[9]"));
		checkbox3.click();
		WebElement gender1 = driver.findElement(By.xpath("(//input)[11]"));
		gender1.click();
		WebElement gender2 = driver.findElement(By.xpath("(//input)[12]"));
		gender2.click();
		WebElement relocate = driver.findElement(By.xpath("(//input)[13]"));
		relocate.click();
		WebElement signup = driver.findElement(By.xpath("(//input)[14]"));
		signup.click();
		
		
	}

}


//WebElement ln = driver.findElement(By.xpath("(//input)[5]"));
//ln.sendKeys("S");
//WebElement submit = driver.findElement(By.xpath("(//input)[6]"));
//submit.click();
//WebElement submit1 = driver.findElement(By.xpath("(//input)[10]"));
//submit1.click();