package MouseOps;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		java.util.List<WebElement> mainMenu=driver.findElements(By.xpath("div[@id='menu']/ul/li/a"));
		System.out.println("Main menu option  count ="+mainMenu.size());
		Actions act=new Actions(driver);
		
		for(int i=0;i<mainMenu.size();i++)
		{
			WebElement option=mainMenu.get(i);
			act.moveToElement(mainMenu.get(1),100,0).perform();
			Thread.sleep(1000);
			
		}
	//	mouseHoverOverTheElement(act, mainMenu.get(2));
		//mouseHover(act, mainMenu);
		//act.moveToElement(mainMenu.get(1), 100, 0).perform();
		//mouseHoverWithCords(act, mainMenu.get(1),100,0);

		rightClick(act, mainMenu.get(1));

	}

	static void mouseHoverOverTheElement(Actions act, WebElement element) {
		act.moveToElement(element).perform();
	}

	static void rightClick(Actions act, WebElement option) {
		System.out.println("Option name is : " + option.getText());
		act.moveToElement(option).contextClick().build().perform();
		// act.contextClick(option).build().perform();
	}

	static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) throws InterruptedException {
		System.out.println("Option name is : " + option.getText());
		act.moveToElement(option, x, y).perform();
	}

	static void mouseHover(Actions act, java.util.List<WebElement> mainMenu) throws InterruptedException {
		for (int i = 0; i < mainMenu.size(); i++) {
			WebElement option = mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);
		}

	}

}
