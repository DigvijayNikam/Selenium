package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("password"));
		password.clear();
		Thread.sleep(2000);
		
		username.sendKeys("admin");
		password.sendKeys("Test@123");
		
		WebElement Login=driver.findElement(By.className("button"));
		Login.click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
