package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

}
