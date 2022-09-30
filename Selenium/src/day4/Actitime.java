package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//to get title from the application use getTitle() of WebDriver interface
		String pageTitle=driver.getTitle();
		System.out.println("Page title is  ="+pageTitle);
		System.out.println("Page title length="+pageTitle.length());
		String expectedTitle="actiTime-Login";
		
		

	}

}
