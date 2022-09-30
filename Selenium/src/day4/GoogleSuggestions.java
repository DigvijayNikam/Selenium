package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement GoogleSearch=driver.findElement(By.className("btnK"));
		System.out.println("GoogleSearch is  Displayed or not?"+GoogleSearch.isDisplayed());
		System.out.println("GoogleSearch is  Enabled or not?"+GoogleSearch.isEnabled());
		
		WebElement Lucky=driver.findElement(By.className("btnI"));
		System.out.println("I m Luckey lable displayed or not?="+Lucky.isDisplayed());
		System.out.println("Is Clickable or not"+Lucky.isEnabled());
		System.out.println(Lucky.getText());
		System.out.println("Hi");
	}
}