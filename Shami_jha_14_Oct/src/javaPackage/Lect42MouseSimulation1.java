package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Lect42MouseSimulation1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		//Create Eletronic Web Element Ref
		
		WebElement eletro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		// Creating Action class for mouse simulation
	
		Actions ac = new Actions(driver);
	
		// mouse Hover to Electronic 
		
		ac.moveToElement(eletro).build().perform();
		
		Thread.sleep(2000);
	
		//KeyBoard Action
		
		WebElement Mobiles = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/span/span"));
		
        //ac.sendKeys(Mobiles, Keys.ENTER);
		
		// Right Click on Web
		
        ac.contextClick(Mobiles).build().perform();
		
        Thread.sleep(2000);
		
		
		
		driver.close();
		
	}

}
