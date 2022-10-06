package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import utilities.ExcelUtility;

public class Assignment extends SeleniumUtility{
	
	
	String appurl;
	String username;
	String password;
	String result;
	
	@BeforeTest
	public void getData()
	{
		
		appurl=ExcelUtility.getCellValue("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\ActiTime.xlsx","Sheet1",1,0);
		username=ExcelUtility.getCellValue("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\ActiTime.xlsx","Sheet1",1,1);
		password=ExcelUtility.getCellValue("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\ActiTime.xlsx","Sheet1",1,2);
	}
@Test
public void login()
{
	WebDriver driver=setUp("chrome",appurl);
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	boolean validationRes=getPageTitle("actiTIME - Enter Time-Track").equals("actiTIME - Enter Time-Track");
	
	if(validationRes) {
		result="Passed";
	}
	//getPageTitle(string)
	else {
		result="Failed";
	}
	
	Assert.assertTrue(validationRes,"Login Page validation failed");
	
	
}


/*	private Object getPageTitle(String string) {
	// TODO Auto-generated method stub
	return null;
}*/
	@AfterTest
	public void cleanup()
	{
		ExcelUtility.updateCellValue("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\ActiTime.xlsx","Sheet1",1,2,result);
		tearDown();
	}
	
}
