package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverProgram_Amazon {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement  accountandlist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);//step1 and step2
		a1.moveToElement(accountandlist).perform();//step3 and step4
		WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		
		
		
		
}

}
