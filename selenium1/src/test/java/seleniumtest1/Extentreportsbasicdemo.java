package seleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreportsbasicdemo {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// extent reports
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		extent.attachReporter(spark);
		
		
		//create a toggle  for a given test
		ExtentTest test1 = extent.createTest("DDGoTest").pass("Started TC");
		
		
		WebDriverManager.firefoxdriver().setup(); 
		driver = new FirefoxDriver();
		
		
		driver.get("https://duckduckgo.com/");
		
		
		test1.pass("Search");
		//extent.createTest("MyFirst").pass("Search");
		//we can also use the above code, to reduce code, we defined "test" to store value 
		
		
		driver.findElement(By.name("q")).sendKeys("extentreports uses");
		
		
		test1.pass("Text entered");
		//extent.createTest("MyFirst").pass("Text entered");
		
		
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		
		
		test1.pass("Clicked");
		
		//extent.createTest("MyFirst").pass("Click");
		
		driver.close();
		//driver.quit();
		
		test1.pass("Close");
		//extent.createTest("MyFirst").pass("Close");
		
		//create a toggle  for a given test2
				ExtentTest test2 = extent.createTest("DDGoTest2").pass("Started TC2");
				
				
				WebDriverManager.chromedriver().setup(); 
				driver = new ChromeDriver();
				
				driver.get("https://duckduckgo.com/");
			    test2.pass("Search");
			
				driver.findElement(By.name("q")).sendKeys("extentreports uses");
				test2.pass("Text entered");
				
				driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
				test2.fail("NotClicked");
				
				driver.close();
				test2.pass("Close");
				
		extent.flush(); //report is created using this
		
	}

}
