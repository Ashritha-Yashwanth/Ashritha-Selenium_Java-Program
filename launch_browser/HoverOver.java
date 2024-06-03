package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args)
	{
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://grotechminds.com/hoverover/");
    WebElement d1 = driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
	Actions a1 = new Actions(driver);
	a1.moveToElement(d1).perform();
	WebElement practice3 = driver.findElement(By.xpath("//div[@class='popup4'][3]"));
	practice3.click();
	
	}
	

}
