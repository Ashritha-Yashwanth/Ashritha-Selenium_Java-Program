package launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDT_gtmreg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://grotechminds.com/registeration-form/");
	      
	      FileInputStream f1 = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Selenium_Basic_Program\\TestData\\Ashritha-Excel.xlsx");
	       Workbook wb =  WorkbookFactory.create(f1);
	       String fn = wb.getSheet("gtm_reg").getRow(1).getCell(0).getStringCellValue();
	       System.out.println(fn);
	       driver.findElement(By.id("firstName")).sendKeys(fn);
	      
	       String ln = wb.getSheet("gtm_reg").getRow(1).getCell(1).getStringCellValue();
	       System.out.println(ln);
	       driver.findElement(By.id("lastName")).sendKeys("ln");
	       
	       String email = wb.getSheet("gtm_reg").getRow(1).getCell(2).getStringCellValue();
	       System.out.println(email);
	      driver.findElement(By.id("email")).sendKeys(email);
	      
	      String phoneno = NumberToTextConverter.toText(wb.getSheet("gtm_reg").getRow(1).getCell(3).getNumericCellValue());
	       System.out.println(phoneno);
	      driver.findElement(By.id("phone")).sendKeys(phoneno);
	      
	      WebElement dd1 = driver.findElement(By.id("gender"));
	      Select s1 = new Select(dd1);
	      s1.selectByValue("female");
	      
	      WebElement dd2 = driver.findElement(By.id("state"));
	      Select s2 = new Select(dd2);
	      s2.selectByVisibleText("Karnataka");
	      
	      String aadhar = NumberToTextConverter.toText(wb.getSheet("gtm_reg").getRow(1).getCell(4).getNumericCellValue());
	       System.out.println(aadhar);
	      driver.findElement(By.id("aadhaar")).sendKeys(aadhar);
	      
	      String pan = wb.getSheet("gtm_reg").getRow(1).getCell(5).getStringCellValue();
	       System.out.println(pan);
	      driver.findElement(By.id("pan")).sendKeys(pan);
	      
	    //  driver.findElement(By.id("terms")).click();
	     // driver.findElement(By.name("Submit")).click();
	      
	}

}
