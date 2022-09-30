package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.DateUtility;
import utilities.SeleniumUtility;

public class ScreenShot {

	public static void main(String args[]) throws IOException
	{
		// TODO Auto-generated method stub
		
		SeleniumUtility su=new SeleniumUtility();
		WebDriver driver=su.setUp("chrome","https://www.facebook.com");
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot,new File("E:\\Eclipse DJ\\Selenium\\Screeenshot\\GoogleSearchPage.png"));*/
		String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddMMyyyyHHmmss",0);
		String fileName="E:\\Eclipse DJ\\Selenium\\Screeenshot\\GoogleSearchPage"+date+".png";
		su.takeScreenshot(fileName);
		
		
	}

}
