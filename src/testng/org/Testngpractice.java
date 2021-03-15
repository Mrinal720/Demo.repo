package testng.org;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngpractice {
	
	 static WebDriver driver;
	
	
	
	
	@Test
	@Parameters({ "url","email","password"})
	public  void login(String url, String email, String password) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/Mrinal Bhardwaj/eclipse-workspace/Selenium/driver1/driver1/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
		
	    Boolean b=driver.findElement(By.xpath("//div[@class='_9ay7']")).isDisplayed();
	    
	    Assert.assertTrue(b);
	}
		
		
	
	
	
	
}
