package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lect49Assertion {

	@Test
	public void testCase1()
	{
	
	String expected = "Facebook helps you connect and share with the people in your life.";
	
	System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\Chromediver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com//");
	
	String actualText = driver.findElement(By.xpath("//*[contains(text(),'Facebook help')]")).getText();
	
	//Equal Assertion
	
	Assert.assertEquals(actualText, expected);
	System.out.println("Equal Assertion is verfied");
	
	// True Assertion
	
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Facebook help')]")).isDisplayed());
		
		System.out.println("True Assertion is Varified");
		
	
	// False Assertion
	
	Assert.assertFalse(driver.findElement(By.id("//*[contains(text(), 'Facebook helps')]")).isSelected());
	System.out.println("False Assertion is Verified");
	
	
	
	
	}

}
