package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
	
        ChromeOptions options= new ChromeOptions();
		
		options.addArguments("headless");
		options.addArguments("window-size=1280,800");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://duckduckgo.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("what is this");
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("Completed");
	}

}
