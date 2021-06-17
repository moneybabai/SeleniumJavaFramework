package seleniumtest1;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestduckduckgoTestNG2 {
	
	WebDriver driver = null;
	
	@BeforeTest

	public void setUpTest() {
		
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver/chromedriver/");
		//driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
	}
	
	@Test

	public void duckduckgoSearch2() {
		
		
		//goto google.com
		driver.get("https://duckduckgo.com/");
		
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("what is this2");
		
		//click search element and then click
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		//working completely
	
	}
	
	@Test

	public void duckduckgoSearch3() {
		
		
		//goto google.com
		driver.get("https://duckduckgo.com/");
		
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("what is this3");
		
		//click search element and then click
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		//working completely
	
		
	}
	
	@AfterTest
	
	public void tearDownTest() {
		
		//close browser
		driver.close();
		//quit
		driver.quit();
		
		System.out.println("Test completed Successfully");
		
	}
	
	
}
