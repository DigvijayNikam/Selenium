package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	
	public static void main(String args[])

	
	{
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> devicename=driver.findElements(By.cssSelector("div>h4>a"));
		//List<WebElement> deviceprice=driver.findElements(By.cssSelector())
		
		for(int i=0;i<devicename.size();i++)
		{
			System.out.println(devicename.get(i).getText());			
		}
	}
}
