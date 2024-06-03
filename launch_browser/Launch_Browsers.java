package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browsers {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());

		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();

		
	}

}
