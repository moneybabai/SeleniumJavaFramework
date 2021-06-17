package DemoTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


@Test(groups = {"AllClassTest"})
public class GroupsTestNG {
	
	@Test(groups = {"sanity"})
	public void test1() {
		
	System.out.println("In Test1");

	}

	@Test(groups = {"smoke"})
	public void test2() {
		
	System.out.println("In Test2");

	}

	@Test(groups = {"sanity","regression"})
	public void test3() {
		
	System.out.println("In Test3");

	}

	@Test(groups = {"windows.smoke"})
	public void test4() {
		
	System.out.println("In Test4");

	}
	
}
