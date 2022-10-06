package TestNG;

import org.testng.annotations.Test;

@Test(timeOut=2000)
public class TimeOut {
	
	public void add() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println(" Exception Handled");
	}
	

}
