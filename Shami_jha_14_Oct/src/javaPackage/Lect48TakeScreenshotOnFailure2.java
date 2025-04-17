package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class Lect48TakeScreenshotOnFailure2 
{
	
	Lect48TakeScreenshotOnFailure1 t1= new Lect48TakeScreenshotOnFailure1();
	
	@Test
	public void doLogin() {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\Chromediver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		

		t1.driver= new ChromeDriver();
		
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		t1.driver.get("https://www.facebook.com/");
		
		t1.driver.findElement(By.id("email")).sendKeys("1234");
		t1.driver .findElement(By.id("wrong pass")).sendKeys("12345");
		
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2)throws Exception
	{
		t1.captureScreenshot(result2);
		
	}
}
