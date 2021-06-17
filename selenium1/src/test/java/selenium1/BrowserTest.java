package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :"+projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"//drivers/gekodriver/geckodriver");
		
		
		//this is the absolute location of the driver
		/* 
		 * /Users/jayadeepy/eclipse-workspace/selenium1/
		 * we also use relative location of the driver by using the above code 
		 * */
		
		//WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		//3000milliseconds which is 3sec
		//driver.quit();
	}
	

}

