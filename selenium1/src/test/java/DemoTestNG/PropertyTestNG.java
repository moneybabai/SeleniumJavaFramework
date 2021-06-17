package DemoTestNG;

import org.testng.annotations.Test;

public class PropertyTestNG {
	
	@Test(priority = 2) // with priority we can set which test to run 1st
	public void test1() {
		System.out.println("In test1");
		
	}
	//we can also give a num less than 1, it will execute first
	@Test(priority = 0)
    public void test2() {
		System.out.println("In test2");
		
	}

	@Test(priority = 1)
    public void test3() {
		System.out.println("In test3");
	
}
	
	
}
