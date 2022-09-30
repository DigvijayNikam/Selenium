package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
	
	public static void main( String args[])
	{
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.name("pwd"));
		//WebElement Login=driver.findElement(By.id("Login"));
		//System.out.println("Login Button is displayed or not? "+Login.isDisplayed());
		//System.out.println("Login button is clickable or not?"+Login.isEnabled());
		System.out.println("Username is displayed or not?"+username.isDisplayed());
		System.out.println("Username is Enabled or not?"+username.isEnabled());
		System.out.println("Password is displayed or not?"+password.isDisplayed());
		System.out.println("Password is Enabled or not? "+password.isEnabled());
		
		WebElement keepmelogin=driver.findElement(By.id("keepLoggedInLabel"));
		
		System.out.println(" Keep me log in labled displayed or not?"+keepmelogin.isDisplayed());
		
		WebElement keepmelogincheckbox=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("Checkbox is displayed or not?"+keepmelogincheckbox.isDisplayed());
		System.out.println(" Checkbox is Enabled or not? "+keepmelogincheckbox.isEnabled());
		boolean result=keepmelogincheckbox.isSelected();
		System.out.println(result==false);
		WebElement keeplogin=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(" Lable is displayed or not"+keeplogin.isDisplayed());
		System.out.println(" Lable is enalbled or not"+keeplogin.isEnabled());
		String checkboxtext=keeplogin.getText();
		System.out.println("checkbox text name="+checkboxtext);
		
	}

}
