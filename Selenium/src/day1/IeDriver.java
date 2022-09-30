package day1;
import org.openqa.selenium.chrome.ChromeDriver;

public class IeDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		//String dir=System.getProperty("user.dir");
		//String exePath=dir+"\\executables\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver","E:\\Eclipse DJ\\Selenium\\executables\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https:www.google.com");
		cdriver.close();
		
	}

}

	