package Listners;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//we need to use this to call our listner which is in other class
//@Listeners(Listners.TestNGListeners.class)

public class TestNgListnerDemo {

	@Test
	public void test4() {
		System.out.println("In test4");
		
	}
	@Test
	public void test5() {
		System.out.println("In test5");
		AssertJUnit.assertTrue(true);
		
	} 
	@Test
	public void test6() {
		System.out.println("In test6");
		throw new SkipException("This test is skipped");
		
	}
}
