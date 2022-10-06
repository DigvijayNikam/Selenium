package practice;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class MavenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumUtility su=new SeleniumUtility();
		WebDriver driver=su.setUp("chrome","https:www.google.com");
		
	}

}
