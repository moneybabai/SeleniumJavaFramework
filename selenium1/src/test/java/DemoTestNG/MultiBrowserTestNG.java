package DemoTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


// accessed from testng3.xml
public class MultiBrowserTestNG {
	
	WebDriver driver = null;
  
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("BrowserName is:"+browserName);
		System.out.println("Thread Count :"+Thread.currentThread().getId());
	
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup(); 
			driver = new FirefoxDriver();
		}	
	
	}
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://duckduckgo.com/");	
		Thread.sleep(4000);
		
		
	}
	
	@AfterTest
    public void result() {
		driver.close();
  		System.out.println("Test completed");
		
	}
}
