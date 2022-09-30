package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayForChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= System.getProperty("user.dir");
		String chromeexpath=str1+".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeexpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		
		//application title validation.
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("Actual google page title is "+actualTitle);

		System.out.println("Expected google page title is "+expectedTitle);
		System.out.println("Google Title validation"+actualTitle.equals(expectedTitle));

		// Page Source Code 
		
		String pagesource=driver.getPageSource();
			System.out.println(" Page source code content length"+pagesource.length());
			
			driver.close();
			
	}

}
