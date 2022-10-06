package TestNG;

import org.testng.annotations.Test;

public class TestNG2 {

	@Test
	public void add()
	{
		int a = 0,b = 0,c;
		c=a+b;
		System.out.println(" This is add method in testng"+c);
		sub();
	}
	
	public void sub()
	{
		int a=10,b=20,c;
		c=b-a;
		System.out.println(" the sub of a & b is = "+c);
		System.out.println("This is a Sub method");
	}
}
