package DemoTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore to ignore all classes
public class IgnoreTestNG {
	
	@Ignore //to ignore this method
	@Test
	public void test1() {
		
		System.out.println(" Inside Test1 ");
	}
	
	@Test
     public void test2() {
		
		System.out.println(" Inside Test2 ");
	}
}
