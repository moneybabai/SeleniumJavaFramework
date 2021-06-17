package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumtest1.GooglesearchPomtest;

public class googleSearchpage {
	
	private static WebElement element;

	//usually we define webdriver here but we need to get from test

	
	
	public static WebElement textbox_search(WebDriver driver) {
		
		WebElement element = null;
		
		element = driver.findElement(By.name("q"));
		return element; 
		
	}
	
	public static WebElement button_search(WebDriver driver) {
    
		element = driver.findElement(By.id("search_button_homepage"));
		return element;
		
	}

}
