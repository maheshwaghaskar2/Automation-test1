package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class Lect43Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\Chromediver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		// Accept alert using JavaScriptExecutor
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript ("document.getElementById('confirmButton').click()");
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		System.out.println();
		
		// Dismiss alert using JavaScriptExecutor
		
		jse.executeScript("document.getElementById('confirmButton').click()");
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		System.out.println("Alert Dismissed");
		
		
		
		driver.close();
	}

}
