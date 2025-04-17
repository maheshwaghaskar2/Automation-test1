package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception{
		
		// setting the property of chrome browser// 

		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\Chromediver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Launching chrome browser instance
		
		WebDriver driver = new ChromeDriver();
		
		// Open Url using get () method 
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		// Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Delete all cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		//Regresh the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Navigate to back 
		driver.navigate().back();
		Thread.sleep(2000);
		
		// navigate to forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Featch the current url
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		// Fetch title of web page
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//Close the browser instance
		driver.close();
		
		
		
	}

}
