package practice.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Mrinal Bhardwaj/eclipse-workspace/Selenium/driver1/driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//input[@id=\"returnCalendar\"]")).click();
		
	    String dateval="Sat, 13 Mar";
	    
	    action(driver,dateval);
	    
	
	}
	
	public static void action(WebDriver driver, String dateval) {
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"')",driver.findElement(By.xpath("//input[value='"+dateval+"']")));
		
	}
}
		
