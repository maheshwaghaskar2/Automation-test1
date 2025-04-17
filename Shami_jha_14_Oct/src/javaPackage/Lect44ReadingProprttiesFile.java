package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect44ReadingProprttiesFile {

	public static void main(String[] args)throws Exception {

		//specify the location of config properties file
		
		File src1 = new File("C:\\Users\\admin\\eclipse-workspace1\\Shami_jha_14_Oct\\src\\Repository\\config.properties");
		
		
		// create FileInputStream class object to load the file 
		
		FileInputStream fis1 = new FileInputStream(src1);
		
		
		// Create Properties class object to read properties file
		
		Properties pro1 = new Properties();
		pro1.load(fis1);
		
		
		
		
		
		
		//specify the location of locator properties file
		
				File src2 = new File("C:\\Users\\admin\\eclipse-workspace1\\Shami_jha_14_Oct\\src\\Repository\\locators.properties");
				
				
				// create FileInputStream class object to load the file 
				
				FileInputStream fis2 = new FileInputStream(src2);
				
				
				// Create Properties class object to read properties file
				
				Properties pro2 = new Properties();
				pro2.load(fis2);
				
				
				
				
				
				
	
				
				
				//specify the location of testdata properties file
				
				File src3 = new File("C:\\Users\\admin\\eclipse-workspace1\\Shami_jha_14_Oct\\src\\Repository\\testdata.properties");
				
				
				// create FileInputStream class object to load the file 
				
				FileInputStream fis3 = new FileInputStream(src3);
				
				
				// Create Properties class object to read properties file
				
				Properties pro3 = new Properties();
				pro3.load(fis3);
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\Chromediver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(pro1.getProperty("facebook"));
		
		// getProperty() is a method will accept the key and return value of that key
		
		driver.findElement(By.id(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.id(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
		
		Thread.sleep(2000);
		
		
		driver.close();
	}

}
