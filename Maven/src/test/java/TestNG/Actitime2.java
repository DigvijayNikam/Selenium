package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actitime2 {
	static WebDriver driver;
	@Test
	public void openbrowser()
	{
		//driver=setUp("chrome",)
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		driver.get("//htpps:www.google.com");
	}

	@Test 
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
	}
	@Test
	public void createTask()
	{
		System.out.println("Hi this is sign up");
	}

	@Test
	public void logout()
	{
		System.out.println(" Hi this is logout");
	}
}
