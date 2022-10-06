package TestNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(enabled=true,priority=1, description="This is testcase 1 and having priority 1")
	public void test1() {
		System.out.println(" Hi this is  test1");
	}
	
	@Test(enabled=true,priority=4)
	public void test2() {
		System.out.println(" Hi this is  test2");
	}
	
	
	@Test(priority=2,enabled=false)
	public void test3() {
		System.out.println(" Hi this is test3");
	}
	
	@Test(priority='z',enabled=true)
	public void testz()
	{
		System.out.println("HI this is  test z");
	}
	
	@Test(priority='a')
	public void testa()
	{
		System.out.println("HI this is  test a");
	}
}
