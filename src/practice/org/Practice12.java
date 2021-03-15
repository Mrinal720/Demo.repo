package practice.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice12 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Mrinal Bhardwaj/eclipse-workspace/Selenium/driver1/driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 driver.get("https://www.makemytrip.com/");
		 
		 driver.findElement(By.xpath("//ul[@class=\"userSection pushRight\"]//li[@data-cy=\"account\"]")).click();
		
		  WebElement date = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]"));

	         date.click();

	        // System.out.println(driver.findElement(By.xpath()));

	         Thread.sleep(3000);
	         String dateVal = "Tue Jun 16 2020";
	        selectDateByJS(driver, dateVal);

	        Thread.sleep(3000);
	    }

	    public static void selectDateByJS(WebDriver driver, String dateVal) {

	        JavascriptExecutor js = ((JavascriptExecutor)driver);
	        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='"+dateVal+ "']")));

	    }
	}


