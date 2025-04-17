package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Relative_xpath {

public static void main(String[] args) throws Exception{
		
		// setting the property of chrome browser

		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Launching chrome browser instance
		
		WebDriver driver = new ChromeDriver();
		
		// Open Url using get () method 
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//Relative xpath 
		/*
		//1)using single attribute 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123");
		
		//2)Using multiple attribute
		driver.findElement(By.xpath("//input[@id='email'][@name='email']")).sendKeys("456");
		*/
		//3)Using contains() method
		driver.findElement(By.xpath("//input[contains(@data-testid,'r')]")).sendKeys("99999");
		
		//4)Using text() method		
		
		//driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
		System.out.println(driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText());
		
		
		
		Thread.sleep(3000);
		driver.close();
	
}
}
