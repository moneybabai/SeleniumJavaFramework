package config;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PropertiesexampleTestNG {

	WebDriver driver = null;
	public static String browserName = null; 

	@BeforeTest

	public void setUpTest() {
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup(); 
			driver = new FirefoxDriver();
		}
	}

	@Test

	public void duckduckgoSearch2() {
		
		driver.get("https://duckduckgo.com/");

		driver.findElement(By.name("q")).sendKeys("what is this2");

		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);


	}

	@AfterTest

	public void tearDownTest() {

		//close browser
		driver.close();
	
		//driver.quit();

		System.out.println("Test completed Successfully");
		PropertiesFile.setProperties();
	}


}



