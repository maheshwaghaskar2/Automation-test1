package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelling_WebTable_Lect41 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.money.rediff.com");
		
		// Extra steps due to security reason
		
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();	
		
		//Create a list of all companies
		
		WebElement<allCompanes> =
		
		
		
		Thread.sleep(3000);
		//driver.close();
		

	}

}
