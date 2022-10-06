package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String pagetitle=driver.getTitle();
		String url=driver.getCurrentUrl();
		driver.manage().timeouts().wait(30);
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.className("textField"));
		password.clear();
		Thread.sleep(2000);
       password.sendKeys("manager");
		Thread.sleep(2000);
        WebElement lable=driver.findElement(By.className("header"));
		WebElement button=driver.findElement(By.id("loginButton"));
		button.click();
		WebElement checkbox=driver.findElement(By.name("remember"));
		System.out.println("Checkbox is displayed or not ="+checkbox.isDisplayed());
		checkbox.isEnabled();
		checkbox.isSelected();
		String title=driver.getTitle();
		System.out.println("Title is ="+title);
		
		
	}

}
