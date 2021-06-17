package Listners;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener {
	
	
	public void onTestStart(ITestResult result) {
	    
		System.out.println("********Test Started"+result.getName());
	  }

	public void onTestSuccess(ITestResult result) {
		System.out.println("********Successful"+result.getName());
	  }

	public void onTestFailure(ITestResult result) {
		System.out.println("********Failed"+result.getName());
	  }

	public void onTestSkipped(ITestResult result) {
		System.out.println("********Skipped"+result.getName());
	  }

	public void onTestFailedWithinSuccessPercentage(ITestResult result) {
	    
	  }
	
	public void onStart(ITestResult context) {
	    
	  }
	
	public void onFinish(ITestResult context) {
		System.out.println("********Tests Finished******"+context.getName());
	  }
}