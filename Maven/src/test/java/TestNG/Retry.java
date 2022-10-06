package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry {

	
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(true,true);
	}
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void Test2()
	{
		
		System.out.println(" Hi this is Test2 method");
		Assert.assertEquals(false,true);
	}

}

