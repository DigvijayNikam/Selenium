package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zauba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zaubacorp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("searchid"));
		search.sendKeys("Bluedart Express Ltd. ");
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.name("op"));
		button.click();
		Thread.sleep(3000);
		driver.close();

	}

}
