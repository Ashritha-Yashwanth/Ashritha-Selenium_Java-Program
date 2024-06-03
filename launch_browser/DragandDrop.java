package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

			public static void main(String[] args) throws InterruptedException
			{
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://grotechminds.com/drag-and-drop/");
				WebElement drag = driver.findElement(By.xpath("(//div[@id='container'])[7]"));
				WebElement drop = driver.findElement(By.xpath("//div[@id='div2']"));
				Actions a1 = new Actions(driver);
				a1.dragAndDrop(drag, drop).perform();
				Thread.sleep(2000);
			
			//ebElement drag1 = driver.findElement(By.id("div2"));
			//ebElement drop1 = driver.findElement(By.id("drag7"));
				a1.dragAndDrop(drop,drag).perform();
				
				
			}

		




	}


