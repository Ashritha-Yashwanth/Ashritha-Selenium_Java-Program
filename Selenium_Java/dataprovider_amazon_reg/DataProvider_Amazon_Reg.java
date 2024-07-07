package dataprovider_amazon_reg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Amazon_Reg 
{
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		Object d1[][]=new Object[5][3];
		d1[0][0]="Aadvik";
		d1[0][1]="9878653235";
		d1[0][2]="aadvik@321";
		
		d1[1][0]="Ashritha";
		d1[1][1]="9878653238";
		d1[1][2]="Ash@321";
		
		d1[2][0]="naavik";
		d1[2][1]="9878653265";
		d1[2][2]="naavik@321";
		
		d1[3][0]="sushravya";
		d1[3][1]="9878653135";
		d1[3][2]="sush@321";
		
		d1[4][0]="Brunda";
		d1[4][1]="9878653205";
		d1[4][2]="brunda@321";
		return d1;
		
	}
  @Test(dataProvider="data1")
  public void testcase1(String name,String mobile_no,String pswd)
  {
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
		driver.findElement(By.id("ap_customer_name")).sendKeys(name);
		driver.findElement(By.id("ap_phone_number")).sendKeys(mobile_no);
		driver.findElement(By.id("ap_password")).sendKeys(pswd);
		driver.findElement(By.id("continue")).click();
  }
}
