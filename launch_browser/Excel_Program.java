package launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream f1 = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Selenium_Basic_Program\\TestData\\Ashritha-Excel.xlsx");
	       Workbook wb =  WorkbookFactory.create(f1);
	       String v1 = wb.getSheet("login").getRow(451).getCell(671).getStringCellValue();
	       System.out.println(v1);
	       
	}

}

