package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.SeleniumUtility;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",".//executables//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		SeleniumUtility s1=new SeleniumUtility();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.close();
	}

}
