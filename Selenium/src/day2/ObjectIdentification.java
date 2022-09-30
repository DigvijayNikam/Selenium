package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String Currentdir=System.getProperty("user.dir");
		String ChromeExpath=Currentdir+"//executables//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",ChromeExpath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement username=driver.findElement(By.id("username"));
		
		username.clear();
		
		Thread.sleep(2000);
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("Test@123");
		
		WebElement Login=driver.findElement(By.className("button"));
		Login.click();
		
		
		
	}

}
