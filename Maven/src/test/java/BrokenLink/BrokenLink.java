package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class BrokenLink extends SeleniumUtility {

	@Test
	public void testBroken()
	{
		String homepage="http://www.zlti.com";
		String url="";
		HttpURLConnection huc=null;
		int rspcode=200;
		
		WebDriver driver=setUp("chrome",homepage);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement>it=links.iterator();
		
		while(it.hasNext())
		{
			url=it.next().getAttribute("href");
			System.out.println(url);
		if(url==null || url.isEmpty())
		{
			System.out.println(" URL is not configured for anchor tag or it is empty");
			continue;
		}
		if(!url.startsWith(homepage))
		{
			System.out.println(" URL belongs to another domain , skipping it");
		continue;
		}
		try {
				huc=(HttpURLConnection)new URL(url).openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				rspcode=huc.getResponseCode();
				if(rspcode>=400)
					System.out.println(url+" is a broken link");
				else
					System.out.println(url+"is a valid link");
		}
		
		
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
	driver.quit();
	}
	
}
