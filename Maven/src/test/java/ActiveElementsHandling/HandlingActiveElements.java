package ActiveElementsHandling;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingActiveElements {

	public static void main(String[] args) {
		
		SeleniumUtility su=new SeleniumUtility();
		WebDriver driver=su.setUp("chrome","https://demo.actitime.com/");
		
		//login into the application without identifying username and password field

			//Verify  mouse pointer is in Username input field.
		WebElement username=driver.switchTo().activeElement();
		String str=username.getAttribute("placeholder");
		System.out.println("Is Mouse in Username field ?"+str.equals("Username"));
		username.sendKeys("admin",Keys.TAB);
		WebElement password=driver.switchTo().activeElement();
		String str1=password.getAttribute("placeholder");
		System.out.println("Is mouse is in Password field ?"+str1.equals("Password"));

		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
	}

}
