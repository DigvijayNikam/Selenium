package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Google {
	
	WebDriver driver;
	@Test
	public void  start()
	{
		SeleniumUtility s1=new SeleniumUtility();
		driver=new ChromeDriver();
		System.out.println("Hi ");
		s1.setUp("chrome","//https:www.google.com");
		//System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		//driver.get("//https:www.google.com");
		
	}

}
