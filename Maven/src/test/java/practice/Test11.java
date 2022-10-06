package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test11 {
//	E:\Eclipse DJ\Maven\src\main\resources\Excel\ActiTime.xlsx
	@BeforeSuite
	public void add11()
	{
		System.out.println("This  is before suite block");
	}
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		
	System.out.println("this  is  beore  method block");
	System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	
	@Test(priority=01,enabled=true)
public void add() throws IOException
{
		System.out.println("Hi this  is  add method");
		FileInputStream fis=new FileInputStream("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\ActiTime.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		System.out.println("Actual row count is ="+row);
				
		
		
}
	@Test(expectedExceptions=ArithmeticException.class)
	public void  dividebyzero()
	{
		int b=10/0;
		System.out.println("Exception handling done");
	}
	
	@Test(priority=00,enabled=true,invocationCount=3)	
	public void sub()
	{
		System.out.println(" Hi this is sub method");
	}

@AfterMethod
public void afterMethod()
{
	driver.close();
}
	
	
}
