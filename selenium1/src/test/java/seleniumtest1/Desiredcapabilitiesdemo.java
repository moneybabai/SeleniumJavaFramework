package seleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Desiredcapabilitiesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); 
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", false);
		
		WebDriver driver = new ChromeDriver(caps);
		
		driver.get("https://duckduckgo.com/");
		driver.findElement(By.name("q")).sendKeys("desired capabilities");
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
		
	}

}
