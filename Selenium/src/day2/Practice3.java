package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	String title=driver.getTitle();
	System.out.println("Title of URL is "+title);
	String url=driver.getCurrentUrl();
	System.out.println(" Current url is ="+ driver.getCurrentUrl());
	System.out.println(url);
	System.out.println("Actual pagesoure = "+driver.getPageSource());
	
	
	driver.close();
		

	}

}
