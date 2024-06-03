package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropJSON {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		//WebElement drag = driver.findElement(By.id("drag11"));
		//WebElement drop = driver.findElement(By.id("div2"));
		Actions a1 =new Actions(driver);
		//a1.dragAndDrop(drag, drop).perform();
		
		//WebElement drag1 = driver.findElement(By.id("drag6"));
		//WebElement drop1 = driver.findElement(By.id("div2"));
		//a1.dragAndDrop(drag1, drop1).perform();
		
		
		//WebElement drag2 = driver.findElement(By.id("drag1"));
		//WebElement drop2 = driver.findElement(By.id("div2"));
		//a1.dragAndDrop(drag2, drop2).perform();
		
		//WebElement drag3 = driver.findElement(By.id("drag4"));
		//WebElement drop3 = driver.findElement(By.id("div2"));
		//a1.dragAndDrop(drag3, drop3).perform();
		
		
		//WebElement drag4 = driver.findElement(By.id("drag3"));
		//WebElement drop4 = driver.findElement(By.id("div2"));
		//a1.dragAndDrop(drag4, drop4).perform();
		
		//WebElement drag5 = driver.findElement(By.id("drag10"));
		//WebElement drop5 = driver.findElement(By.id("div2"));
		//a1.dragAndDrop(drag5, drop5).perform();
		
		WebElement drag6 = driver.findElement(By.id("drag9"));
		WebElement drop6 = driver.findElement(By.id("div2"));
		a1.dragAndDrop(drag6, drop6).perform();
		
		
		
		
		
	}

}
