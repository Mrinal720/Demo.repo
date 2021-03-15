package practice.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice9 {

	public static void main(String[] args){
		
System.setProperty("webdriver.chrome.driver", "/Users/Mrinal Bhardwaj/eclipse-workspace/Selenium/driver1/driver1/chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.navigate().to("https://www.facebook.com/");
	    
	    WebElement element= driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
	   
	    String message="Dhoni is LIfe";
	    
	    WebElement el= driver.findElement(By.xpath("//div[@id=\"pageFooterChildren\"]//ul//li//a[@href=\"/privacy/explanation\"]"));
				flash(element,driver);
				
				
				
				scrolling(el,driver);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
				}
				border(element,driver,el);
				
				
				
		alert(driver,message);
				
				
		rfresh(driver);
		
	}
	
	
	    public static void flash(WebElement element, WebDriver driver)  {
	    	JavascriptExecutor js= ((JavascriptExecutor) driver);
	    	String bgcolor= element.getCssValue("backgroundColor");
	    
	    	
	    	for(int i=0;i<2;i++) {
	    		
	    		changecolor("rgb(0,200,0)",element,driver);
	    		changecolor(bgcolor,element,driver);
	    		
				
	    		
	    		
	    	}
	    }


		public static void changecolor(String color, WebElement element, WebDriver driver)  {
			
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			
			js.executeScript("arguments[0].style.backgroundColor = ' "+color+"'", element);
			
			
			try{Thread.sleep(3000);
	    	}
			catch(InterruptedException e) {
				
			}
		}

		public static void rfresh( WebDriver driver) {
			
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			
			js.executeScript("history.go(0)");
		}

		public static void click(WebElement element, WebDriver driver) {
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			
			js.executeScript("arguments[0].click();", element);
			
		}
		
		public static void border(WebElement element, WebDriver driver,WebElement el) {
			
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			
			js.executeScript("arguments[0].style.border='3px solid red'",element);
			
			js.executeScript("arguments[0].style.border ='3px solid black' ", el);
			
		}

		public static void scroll( WebDriver driver) {
			
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			
			
			
		}
		
		public static void scrolling(WebElement el, WebDriver driver) {
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			
			js.executeScript("arguments[0].scrollIntoView(true);",el);
		}


		
		public static void alert(WebDriver driver, String message) {
			
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			js.executeScript("alert('"+message+"')");
			
		}

}
	    	
	   
	    
	
