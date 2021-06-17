package seleniumtest1;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.googleSearchpage;

public class GooglesearchPomtest {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
		
	}

	public static void googleSearch() {
		
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
		//goto duckduckgo 
		driver.get("https://duckduckgo.com/");
		
		//enter text in search box
		//driver.findElement(By.name("q")).sendKeys("Selenium forms");
		
	    googleSearchpage.textbox_search(driver).sendKeys("POM test");

		//click search element and then click
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	    googleSearchpage.button_search(driver).sendKeys(Keys.ENTER);
		
		//close browser
		//driver.close();
		
		System.out.println("Test completed Successfully");
	}
	
}
