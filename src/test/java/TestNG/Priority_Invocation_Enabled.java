package TestNG;

import org.testng.annotations.Test;

public class Priority_Invocation_Enabled {
	
	@Test(priority=-7,invocationCount=0)
	public void demo1() {
		System.out.println("Hi demo1");
	}
	
	@Test(priority=-1,invocationCount=2,enabled = false)
	public void demo2() {
		System.out.println("Hi demo2");
	}
	
	@Test(priority=-5)
	public void demo3() {
		System.out.println("Hi demo3");
	}

}
