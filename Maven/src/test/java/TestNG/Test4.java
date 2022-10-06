package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {

	@BeforeTest
	public void sata()
	{
		System.out.println("hi i am sata");
	}
	@Test
	public void pata()
	{
		System.out.println(" Hi I am pata");
	}

	@AfterTest
	public void lata()
	{
		System.out.println("Hi i am lata");
	}
	
}
