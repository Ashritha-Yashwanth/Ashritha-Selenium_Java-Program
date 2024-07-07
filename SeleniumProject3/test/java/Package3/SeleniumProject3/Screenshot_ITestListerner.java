package Package3.SeleniumProject3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot_ITestListerner implements ITestListener
{
	static ChromeDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		TakesScreenshot a1 = driver;
	      File source = a1.getScreenshotAs(OutputType.FILE);
	      File destination = new File("C:\\Users\\USER\\Desktop\\ITestListerner\\pass\\"+"pass"+Math.random()+".png");
	      try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot a1 = driver;
	      File source = a1.getScreenshotAs(OutputType.FILE);
	      File destination = new File("C:\\Users\\USER\\Desktop\\ITestListerner\\fail\\"+"failed"+Math.random()+".png");
	      try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
