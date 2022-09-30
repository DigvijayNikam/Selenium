package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeGenericWay {

	public static void main(String[] args) {
		
		
		String driverpath1=".\\executables\\IEDriverServer.exe";
		String driverpath2=System.getProperty("user.dir")+".\\executables\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",driverpath2);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https:www.google.com");

	}

}
