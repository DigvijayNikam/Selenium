package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");

		String actualTitle=driver.getTitle();
		System.out.println(" Title of URL is = "+actualTitle);
		
		String Pagesource=driver.getPageSource();
		
		System.out.println(" Length of pagesource ="+Pagesource.length());
		
		WebElement element=driver.findElement(By.id("username"));
		element.sendKeys("trainee");
		
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("trainee");
		
		WebElement Login=driver.findElement(By.id("Login"));
		Login.click();
		
		
		driver.close();
		
	}

}
