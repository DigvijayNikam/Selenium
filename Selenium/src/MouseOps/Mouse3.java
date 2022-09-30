package MouseOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//executables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			// Frame Handling
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		Actions act = new Actions(driver);

		List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target = driver.findElement(By.id("trash"));
//		act.dragAndDrop(sourceElements.get(0), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElements.get(1), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElements.get(2), target).build().perform();
		
		performDranAndDrop(act, sourceElements.get(1), target);
		performDranAndDrop(act, sourceElements.get(0), target);
		performDranAndDrop(act, sourceElements.get(2), target);
	}
	
	static void performDranAndDrop(Actions act,WebElement src,WebElement target) {
		act.dragAndDrop(src, target).build().perform();
	}

}



