package dataprovider_facebook_reg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_Reg
{
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		Object d1[][]=new Object[5][4];
		d1[0][0]="Aadvik";
		d1[0][1]="sh";
		d1[0][2]="9878653235";
		d1[0][3]="aadvik@321";
		
		d1[1][0]="Ashritha";
		d1[1][1]="s";
		d1[1][2]="9878653238";
		d1[1][3]="Ash@321";
		
		d1[2][0]="naavik";
		d1[2][1]="h";
		d1[2][2]="9878653265";
		d1[2][3]="naavik@321";
		
		d1[3][0]="sushravya";
		d1[3][1]="y";
		d1[3][2]="9878653135";
		d1[3][3]="sush@321";
		
		d1[4][0]="Brunda";
		d1[4][1]="ss";
		d1[4][2]="9878653205";
		d1[4][3]="brunda@321";
		return d1;
	}
 @Test(dataProvider="data1")
 public void reg(String fname,String lname,String mobile_no,String pswd)
 {
	 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805964%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805964&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=EAIaIQobChMIq7_cmI3yhgMVQ6lmAh0uvwgaEAAYASAAEgLZE_D_BwE");
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		
		WebElement date = driver.findElement(By.id("day"));
		Select s1 = new Select(date);
		s1.selectByVisibleText("15");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Dec");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]")).click();
		driver.findElement(By.name("reg_email__")).sendKeys(mobile_no);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pswd);
		driver.findElement(By.name("websubmit")).click();
		
		
		
 }
}
