package TestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.SeleniumUtility;

public class ExtentDemo extends SeleniumUtility {
	
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public static  void startTest()
	{
	report=new ExtentReports(".\\ExtentReport\\ExtentReportResult.html");
	
	}
	
	@Test
	public void testCase1()throws IOException
	{
		WebDriver driver=setUp("chrome","https://www.google.com");
		if(getPageTitle().equals("Google"))
		{
			
		}
		
		
	}

}
