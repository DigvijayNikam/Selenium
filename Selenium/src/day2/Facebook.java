package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");

		String title=driver.getTitle();
		System.out.println(" The actual tile of url is ="+title);
		String expectedtitle="Facebook – log in or sign up";
		System.out.println("The expected title is ="+expectedtitle);
		System.out.println("The comparison of actual and expected is "+expectedtitle.equals(title));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close();
	}

}
