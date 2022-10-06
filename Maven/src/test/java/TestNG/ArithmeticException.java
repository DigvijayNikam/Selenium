package TestNG;

import org.testng.annotations.Test;

public class ArithmeticException {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void exception()
	{
		
		System.out.println("Exception  test");
		int a=10,b=0,c;
		c=a/b;
		System.out.println(" Exception handling done ");
	}

	@Test(timeOut=2000)
	public void timeout()throws InterruptedException
	{
		Thread.sleep(500);
	}
}
