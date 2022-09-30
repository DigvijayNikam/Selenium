package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitewait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse DJ\\Selenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String Pagetitle=driver.getTitle();
		System.out.println(" Page title is ="+Pagetitle);
		System.out.println(" Page Length ="+Pagetitle.length());
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.className("oxd-input--active"));
		password.sendKeys("admin123");
		
		WebElement Login=driver.findElement(By.className("orangehrm-login-button"));
					
		Login.click();
		
		
		String HomePageUrl=driver.getCurrentUrl();
		System.out.println(" Home Validation status ="+HomePageUrl.contains("viewEmployeeList"));

		driver.close();
	}

}
