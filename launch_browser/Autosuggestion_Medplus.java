package launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Medplus {

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://pharmeasy.in/");
     WebElement search =  driver.findElement(By.xpath("(//div[@class='c-PJLV c-bXbWpx c-bXbWpx-icOztnM-css'])"));
     search.click();
     driver.findElement(By.id("topBarInput")).sendKeys("paracetamol");
     Thread.sleep(2000);
     List<WebElement> autosuggestion = driver.findElements(By.xpath("(//div[@class='c-PJLV c-bXbWpx c-bXbWpx-lfylVv-direction-row c-bXbWpx-ieEdGyD-css']/div/span)"));
     int count = autosuggestion.size();
     System.out.println(count);
     autosuggestion.get(5).click();
	}

}
