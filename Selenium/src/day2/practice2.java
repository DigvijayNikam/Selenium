package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.className("button"));
		button.click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
