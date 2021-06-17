package DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTestNG {
	
	
	@Test
	public void test1() {
		System.out.println("In test1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("In test2");
		//int i =1/0; //we deliberately failing
		
	}
	@Test(retryAnalyzer = Listners.RetryAnalyserTestNG.class)
	public void test3() {
		System.out.println("In test3");
		Assert.assertTrue(0>1);
		
	}
	
}
