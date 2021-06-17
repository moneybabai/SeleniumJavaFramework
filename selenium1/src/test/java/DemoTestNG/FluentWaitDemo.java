package DemoTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	
	
	//fluent wait need to study again
	
	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.findElement(By.name("q")).sendKeys("SAP");
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		
		
	
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 //WebElement linkelement = driver.findElement(By.linkText("SAP - Wikipedia")).click();
		    	 
		       return driver.findElement(By.id("foo"));
		     }
		   });
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
}
