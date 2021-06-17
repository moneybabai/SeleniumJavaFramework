package seleniumtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendreportTestNG {
	
	//these variables are made available gloablly 
	//so that they can be used in every class
	WebDriver driver;
	ExtentSparkReporter spark;
	ExtentReports extent;
	
	
	
	@BeforeSuite
	public void setUp() { //setup should run before test run
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("Spark.html");
		extent.attachReporter(spark);
		
		
	} /* If we have multiple test cases. Then we want Beforetest and Aftertest to run once
	* Then we will use BeforeSuit and aftersuite
	*/
	

	@BeforeTest

	public void setUpTest() {
		
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void test1() { //code for test case
		ExtentTest test1 = extent.createTest("DDGoTest").pass("Started TC");
		
		driver.get("https://duckduckgo.com/");
		test1.pass("Navigated to DDGo");
		
		test1.log(Status.INFO, "This step shows status of log");
		test1.info("This step shows status ofinfo");
		test1.fail("fail details");
		test1.addScreenCaptureFromPath("extent.png");
		test1.pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
		
	}
	
	@Test
	public void test2() { //code for test case
		ExtentTest test2 = extent.createTest("DDGoTest2").pass("Started TC");
		test2.log(Status.INFO, "This step shows status of log");
		test2.info("This step shows status ofinfo");
		test2.pass("pass details");
		test2.addScreenCaptureFromPath("extent.png");
		test2.pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
		
	}
	
   @AfterTest
	
	public void tearDownTest() {
		
		//close browser
		driver.close();
		//quit
		driver.quit();
		System.out.println("Test completed Successfully");
		
	}
	
	@AfterSuite
	public void teardown() { //After our test has run for doing all the teardown
		//we disconect database that we aced before
		extent.flush();
	}
}
