package TestNG;

import org.testng.annotations.Test;

public class Invocation {

@Test (enabled=true,invocationCount=5)
public void invoke()
{
	System.out.println("this is invoke method");
}

@Test(enabled=false,invocationCount=10)
public void invoke1()
{
	System.out.println("this is invoke1 method");
}

}
