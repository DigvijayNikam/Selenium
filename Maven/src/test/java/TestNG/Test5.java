package TestNG;

import org.testng.annotations.Test;

public class Test5 {

	@Test (enabled=true,timeOut=200)
	public void openBrowser()throws InterruptedException
	{
	Thread.sleep(180);
	System.out.println(" Open browser and enter url");
	}
	
	@Test (enabled=true)//timeOut=100)
	public void add() //throws InterruptedException
	{
		System.out.println(" hI ");
	}
}
