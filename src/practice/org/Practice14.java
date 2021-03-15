package practice.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice14 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Mrinal Bhardwaj/eclipse-workspace/Selenium/driver1/driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/account/about//");
		
		driver.findElement(By.xpath("//a[@aria-label=\"Create a Google Account\"]")).click();
		
		driver.findElement(By.xpath("//div[@role=\"listbox\"]")).click();
		
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@role=\"listbox\"]//div[@class=\"MocG8c B9IrJb LMgvRb\"]/descendant::span[@class=\"vRMGwf oJeWuf\"]"));
	   System.out.println(list.size());
	   
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
}
}
		
	