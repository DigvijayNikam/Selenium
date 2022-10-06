package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Amz {

	public static void main(String[] args) {
		
		SeleniumUtility su=new SeleniumUtility();
		
		WebDriver driver=su.setUp("chrome","https://www.amazon.in");
		List<WebElement> options=driver.findElements(By.xpath("//div[@id='nav-xshop-container']"));
		System.out.println("Options count : "+options.size());
		for(int i=0;i<options.size();i++)
			System.out.println(options.get(i).getText());
		
	}
}


