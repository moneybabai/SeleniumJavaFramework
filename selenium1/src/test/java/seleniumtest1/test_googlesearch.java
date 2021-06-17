package seleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
		
	}

	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com/");
		
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Selenium forms");
		
		//click search element and then click
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	
		
		//close browser
		
		
		System.out.println("Test completed Successfully");
	}
	
}
