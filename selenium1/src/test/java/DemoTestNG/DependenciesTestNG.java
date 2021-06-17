package DemoTestNG;

import org.testng.annotations.Test;

public class DependenciesTestNG {
	
	
	
	@Test(dependsOnGroups = {"sanity.*"})
	public void test1() {
		System.out.println("Inside Test1");
	}
	
	@Test(groups={"sanity1"})
	public void test2() {
		
		System.out.println("Inside Test2");
		
	}
	@Test
	public void test3() {
		
		System.out.println("Inside Test3");
		
	}
}
