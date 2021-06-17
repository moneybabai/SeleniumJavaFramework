package DemoTestNG;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


//recorded this entire stepa from seleniumIDE

public class RecordTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @Before
  public void setUp() {
	  
	  WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    driver.get("https://duckduckgo.com/");
    driver.manage().window().setSize(new Dimension(1160, 839));
    driver.findElement(By.id("search_form_input_homepage")).sendKeys("wikipedia");
    driver.findElement(By.id("search_form_input_homepage")).sendKeys(Keys.ENTER);
    driver.findElement(By.linkText("Wikipedia")).click();
    driver.findElement(By.cssSelector("#js-link-box-en > strong")).click();
    driver.findElement(By.linkText("Main page")).click();
    driver.close();
  }
}
