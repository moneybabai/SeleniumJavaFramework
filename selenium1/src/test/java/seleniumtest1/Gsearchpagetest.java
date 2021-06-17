package seleniumtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Gsearchpageobjects;

//here we are using this class for just to store Test purpose

public class Gsearchpagetest {

	WebDriver driver = null;
	
	public static void main(String[] args) {
		
		Gsearchpagetest(); //we are using this class for test so defining in main class
		
	}

	public static void Gsearchpagetest() {
		
		WebDriverManager.firefoxdriver().setup(); 
		WebDriver driver = new FirefoxDriver();
		
		
		Gsearchpageobjects searchPageObj = new Gsearchpageobjects(driver);
		
		driver.get("https://duckduckgo.com/");
		
		searchPageObj.setTextInSearchBox("Start ");
		
		searchPageObj.clickSearchButton();
		
		driver.close();
	}

}

