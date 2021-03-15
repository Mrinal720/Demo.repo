package practice.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Mrinal Bhardwaj/eclipse-workspace/Selenium/driver1/driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	
driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("testing");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"UUbT9\"]//ul[@role=\"listbox\"]//li/descendant::span"));

   System.out.println(list.size());
   
   for(int i=0;i<list.size();i++) {
	   
	   try {
	 
	 
	 if(list.get(i).getText().contains("testing interview questions")) {
		 list.get(i).click();	
		 break;
	      
	 }
	   }
		 catch(StaleElementReferenceException e) {
		 }
		 }
	}
	

}