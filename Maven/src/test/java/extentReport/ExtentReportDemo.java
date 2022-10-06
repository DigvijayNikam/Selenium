package extentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo {

	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void stratReport()
	{
		report=new ExtentReports("./ExtentReport/ExtentReport.html",true);
		report.addSystemInfo("HostName","Digvijay").addSystemInfo("Environment","Dev").addSystemInfo("UserName","Digvijay Nikam");
	}
	
	
@Test
public void testCase1()
{
	test=report.startTest("TestCase1");
	Assert.assertTrue(true);
	test.log(LogStatus.PASS,"Test case1 is  passed");
}
	@Test
	public void testCase2()
	{
		test=report.startTest("Testcase2");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL,"teST CASE2 IS FAILD");
	}

@Test
public void skipTest()
{
	test=report.startTest("TestCase3");
	throw new SkipException("Skipping this its not ready for testing");
	
}

@AfterMethod
public void getResult(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	test.log(LogStatus.FAIL,"Test case faild due to  "+result.getName());	
	test.log(LogStatus.FAIL,"tEST case is failed due to "+result.getThrowable());
	
	
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
	test.log(LogStatus.SKIP,"tEST cASE SKIPPED DUE  TO  "+result.getName());
	}
	report.endTest(test);
}
@AfterTest
public void endReport()
{
	report.flush();
	report.close();

}
}
