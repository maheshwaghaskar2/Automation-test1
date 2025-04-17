package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_lect40 {

	
	public static void main(String[] args) {
		//setting the property of chrome browser and and passing chrome browser path 
		System.setProperty("webdriver.chrome.driver", "E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit wait 
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com//");
		
		//Enter username
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		// Fetch inputbox attribut value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		
		
		//Use Explicit Wait 
		WebDriverWait wt = new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("abcd");
		
		driver.close();
		
	}
}
