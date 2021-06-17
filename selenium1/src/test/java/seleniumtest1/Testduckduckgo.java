package seleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testduckduckgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
		
	}

	public static void googleSearch() {
		
		WebDriverManager.firefoxdriver().setup(); 
		WebDriver driver = new FirefoxDriver();
		
		//goto google.com
		driver.get("https://duckduckgo.com/");
		
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("what is this");
		
		//click search element and then click
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		//working completely
	
		
		//close browser
		
		
		System.out.println("Test completed Successfully");
	}
	
}
