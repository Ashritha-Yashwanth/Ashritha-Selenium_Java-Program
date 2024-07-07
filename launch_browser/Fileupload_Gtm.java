package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fileupload_Gtm {

	public static void main(String[] args)
	{
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://grotechminds.com/registration/");
     driver.findElement(By.id("fname")).sendKeys("Ashritha");
     driver.findElement(By.id("lname")).sendKeys("S");
     driver.findElement(By.id("email")).sendKeys("ashritha030@gmail.com");
     driver.findElement(By.id("password")).sendKeys("test@123");
     driver.findElement(By.id("Female")).click();
     WebElement dd = driver.findElement(By.id("Skills"));
     Select s1 = new Select(dd);
     s1.selectByIndex(1);
     
     WebElement dd1 = driver.findElement(By.id("Country"));
     Select s2 = new Select(dd1);
     s2.selectByValue("India");
     
     driver.findElement(By.id("Present-Address")).sendKeys("Maruti krupa.4th main,Tumkur");
     driver.findElement(By.id("Permanent-Address")).sendKeys("#21,1st main,Bangalore");
     driver.findElement(By.id("Pincode")).sendKeys("9868");
     WebElement dd3 = driver.findElement(By.id("Relegion"));
     Select s3 = new Select(dd3);
     s3.selectByVisibleText("Hindu");
     
     WebElement file = driver.findElement(By.id("file"));
     file.sendKeys("C:\\Users\\USER\\Downloads\\Ashritha S - Resume (2).pdf");
     driver.findElement(By.id("relocate")).click();
     driver.findElement(By.name("Submit")).click();
	}

}
