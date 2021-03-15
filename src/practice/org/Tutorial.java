package practice.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tutorial {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Mrinal Bhardwaj/eclipse-workspace/Selenium/driver1/driver1/chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();	
	    
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	    
	    driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][normalize-space()='Input Forms']")).click();
	    
	   
	    driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[@href=\"./basic-checkbox-demo.html\"]")).click();
	
	
	    
	  driver.findElement(By.xpath("//label[normalize-space()='Option 3']")).click();
	  
		
	
	}

}
