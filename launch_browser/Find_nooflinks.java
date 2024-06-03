package launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_nooflinks {

	public static void main(String[] args)
	{
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in");
     
     List<WebElement> links = driver.findElements(By.tagName("a"));
     int count = links.size();
     for(int i=0;i<count;i++)
     {
    	 WebElement s1 = links.get(i);
    	 String link_text = s1.getText();
    	 String link = s1.getAttribute("href");
    	 System.out.println(link_text);
    	 System.out.println(link);
    	 }
     
	}

}
