package practice.org;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowpop {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "/Users/Mrinal Bhardwaj/eclipse-workspace/Selenium/driver1/driver1/chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	    
	    driver.manage().deleteAllCookies();
	   
	    driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Follow Twitter & Facebook']")).click();
	    
	    Set<String> handles=driver.getWindowHandles();
	    
	    Iterator<String> it= handles.iterator();
	    
	    String window=it.next();
	    System.out.println(window);
	    
	    String window1= it.next();
	    System.out.println(window1);
	    
	    String window2=it.next();
	    System.out.println(window2);
	   
	    driver.switchTo().window(window);
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().window(window1);
	    System.out.println(driver.getTitle());
	}

}
