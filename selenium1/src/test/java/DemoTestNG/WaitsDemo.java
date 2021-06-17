package DemoTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
		
	}

	public static void seleniumWaits() {
		
		WebDriverManager.firefoxdriver().setup(); 
		WebDriver driver = new FirefoxDriver();
		
		//it will wait for 10seconds before throwing an error
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//default frequency of polling is 250milli seconds
		
		
		driver.get("https://duckduckgo.com/");
		driver.findElement(By.name("q")).sendKeys("SAP");
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		
		//WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		//we are waiting for 10seconds explicit wait 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("SAP")));
		
		driver.findElement(By.name("SAP")).click();
		driver.close();
		
	}

}
