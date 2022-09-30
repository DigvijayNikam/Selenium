package MouseOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility su=new SeleniumUtility();
		WebDriver driver=su.setUp("chrome","https://jqueryui.com/droppable/\");\r\n");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src=driver.findElement(By.cssSelector("#draggable"));
		WebElement target=driver.findElement(By.cssSelector("#droppable"));
		su.performDranAndDrop(src,target);
	}

}
