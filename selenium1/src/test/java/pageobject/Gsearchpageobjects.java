 package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

// here we are using for just storing objects

public class Gsearchpageobjects {
	
    /*when driver is used here, the driver should not be called here for test case
	*as it returns null so we create a constructor
	*/  
	WebDriver driver = null;

	// we can define the object like the following
	By textbox_search = By.id("search_form_input_homepage");
	By button_search = By.id("search_button_homepage");
	
	/*creating a constructor as same name as class
	*creating webdriver, so where ever an object is called driver instance will be called
	*/
	public Gsearchpageobjects(WebDriver driver) {
		//here we r reffering "driver" from Gsearch obj 
		this.driver = driver;
	}
	
	
	//we are creating a seperate class for every object
	public void setTextInSearchBox(String text) {
		
		//here the value is not constant "text" it varies
		
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	public void clickSearchButton() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	
}
 