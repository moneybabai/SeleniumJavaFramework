package Listners;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//we need to use this to call our listner which is in other class
//@Listeners(Listners.TestNGListeners.class)

public class TestNgListnerDemo2 {

	@Test
	public void test1() {
		System.out.println("In test1");
		
	}
	@Test
	public void test2() {
		System.out.println("In test2");
		
		WebDriverManager.firefoxdriver().setup(); 
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://duckduckgo.com/");
		driver.findElement(By.name("q")).sendKeys("what is this");
		driver.findElement(By.id("search_button_homep")).sendKeys(Keys.RETURN);
		driver.close();
	} 
	@Test
	public void test3() {
		System.out.println("In test3");
		throw new SkipException("This test is skipped");
		
	}
}
