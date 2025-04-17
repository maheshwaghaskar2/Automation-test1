package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lect42MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com//draggable");
		
		//Switching to frame 
		
		driver.switchTo().frame(0);
		// Draggable Web Element
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		// Drag and drop using Action class
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDropBy(drag, 100, 100).build().perform();
		
        Thread.sleep(2000);
		
		driver.close();
	}

}
