package selenium1;

import java.awt.Dimension;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		//without version mentioned, it will run the latest version
		//we can use specific version also ".version(2.36)"
		//WebDriverManager.chromedriver().version("2.36").setup()
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("MH@gmail.com");
		//we use this single line code to run or we can define seperately like below
		//WebElement textBox = driver.findElement(By.id("email"));
		//textBox.sendKeys("tbf@gmail.com");
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MH@gmail.com");
		
		List listOfInputElements = (List) driver.findElements(By.xpath("//input"));
		
		 Dimension count = listOfInputElements.size();
		
		 System.out.println("Count of Input Elements :"+count);
		 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //driver.close();
		//driver.quit();
	}

}
