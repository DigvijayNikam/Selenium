package MouseOps;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class MouseWithUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumUtility m1=new SeleniumUtility();
		WebDriver driver=	m1.setUp("chrome", "https://www.facebook.com/");
	}

}
