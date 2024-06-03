package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfPage {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		String title = driver.getTitle(); // gives the title of the page
		System.out.println(title);
	}

	
}
