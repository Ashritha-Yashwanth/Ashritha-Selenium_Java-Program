package launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Amazon_reg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Selenium_Basic_Program\\TestData\\Ashritha-Excel.xlsx");
	       Workbook wb =  WorkbookFactory.create(f1);
	       String username = wb.getSheet("Amazon_reg").getRow(1).getCell(0).getStringCellValue();
	       System.out.println(username);
	       driver.findElement(By.id("ap_customer_name")).sendKeys(username);
	       
	     
	       String mobileno = NumberToTextConverter.toText(wb.getSheet("Amazon_reg").getRow(1).getCell(1).getNumericCellValue());
	       System.out.println(mobileno);
	       driver.findElement(By.id("ap_phone_number")).sendKeys(mobileno);
	       
	       String password = wb.getSheet("Amazon_reg").getRow(1).getCell(2).getStringCellValue();
	       System.out.println(password);
	       driver.findElement(By.id("ap_password")).sendKeys(password);
	       
	       driver.findElement(By.id("continue")).click();    
	   
	}

}
