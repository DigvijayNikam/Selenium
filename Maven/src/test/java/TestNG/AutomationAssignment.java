package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class AutomationAssignment extends SeleniumUtility {
	WebDriver driver;

	@BeforeSuite
	public void Login() throws InterruptedException {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		;

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement button = driver.findElement(By.className("oxd-button"));
		button.click();

	}

	@Test(priority = 0)
	public void addmember() throws InterruptedException {
		WebElement newuser = driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		newuser.click();
		Thread.sleep(2000);
		WebElement Firstname = driver.findElement(By.xpath("//div[input[@name=\"firstName\"]]/input"));
		Firstname.clear();
		Firstname.sendKeys("Digvijay");
		WebElement lastname = driver.findElement(By.xpath("//div[input[@name=\"lastName\"]]/input"));
		lastname.clear();
		lastname.sendKeys("Nikam");
//		WebElement empid = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
//		Thread.sleep(3000);
//		empid.clear();
//		empid.sendKeys("0264");
		WebElement save = driver.findElement(By.xpath("//div[button[text()=\" Save \"]]/button[2]"));
		save.click();
		Thread.sleep(5000);

	}

	@Test(priority = 1)
	public void Pim() {
		WebElement pim = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
		pim.click();
	}

	@Test(priority = 2)
	public void Del() {
		
		WebElement search=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		search.click();
		WebElement input=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		input.click();
		
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='oxd-table orangehrm-employee-list']"));
		
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().contains("Digvijay"))
			{
				WebElement delete=driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space']"));
				driver.switchTo().alert().accept();
			}
		}
//		input.sendKeys("Digvijay");
//		Actions act=new Actions(driver);
//		act.moveToElement(input,0,-100).perform();
//		act.click();
//		
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
		confirm.click();
		search.click();
		
		WebElement delete = driver.findElement(By.xpath("//div[div[contains(text(),\"aavan\")]]"));
		delete.click();
	}
}
