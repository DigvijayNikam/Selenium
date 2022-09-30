package day3;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersOperations {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
	//	driver.manage().window().setSize(new Dimension(450, 600));
		driver.findElement(By.name("username"));
		driver.findElement(By.name("password"));
		Thread.sleep(500);
		driver.findElement(By.className("orangehrm-login-button")).click();
		System.out.println("Forgot Password URL = "+ driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);

		driver.navigate().refresh();
		Thread.sleep(500);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(500);
		driver.close();
		

	}

}
