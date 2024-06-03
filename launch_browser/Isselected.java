package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) 
	{
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/USER/Documents/learningHTML1.html");
    WebElement male_radio = driver.findElement(By.id("123"));
    boolean b1 = male_radio.isSelected();
    if(b1==true)
    {
    	System.out.println("its selected");
    }
    else
    {
    	System.out.println("its not selected");
    	male_radio.click();
    }
	}

}
