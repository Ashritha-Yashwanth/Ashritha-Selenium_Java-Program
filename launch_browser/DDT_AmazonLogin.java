package launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_AmazonLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    
		FileInputStream f1 = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Selenium_Basic_Program\\TestData\\Ashritha-Excel.xlsx");
	       Workbook wb =  WorkbookFactory.create(f1);
	       String username = wb.getSheet("amazon_login").getRow(1).getCell(0).getStringCellValue();
	       System.out.println(username);
	       WebElement un = driver.findElement(By.id("ap_email"));
	       un.sendKeys(username);
	       
	       WebElement un_continue = driver.findElement(By.id("continue"));
	        un_continue.click();
	        
	        String password = wb.getSheet("amazon_login").getRow(1).getCell(1).getStringCellValue();
		       System.out.println(password);
		       WebElement pswd = driver.findElement(By.name("password"));
		        pswd.sendKeys(password);
		        
		        WebElement signin_button = driver.findElement(By.id("signInSubmit"));
		        signin_button.click();
	        
	       
	    
	}

}
