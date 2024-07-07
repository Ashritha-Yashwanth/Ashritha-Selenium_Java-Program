package package1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page 
{
//step 1 : locate each element using@FindBy
	
	WebDriver driver;
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement loginbutton;
	
//step 2: creating separate methods for each components to perform its action	
	
	public void un()
	{
		username.sendKeys("ash@gmail.com");
	}
	
	public void pswd()
	{
		password.sendKeys("ash@123");
	}
	
	public void login()
	{
		loginbutton.click();
	}
//step 3 : initialize each element using Pagefactory class inside the constructor
	
	public Facebook_Login_Page(WebDriver driver)//constructor
	{
		PageFactory.initElements(driver,this);
	}
}
