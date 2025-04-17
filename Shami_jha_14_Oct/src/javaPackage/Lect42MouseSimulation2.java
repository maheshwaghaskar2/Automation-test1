package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lect42MouseSimulation2 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com//droppable");
		
		//Switching to frame 
		
		driver.switchTo().frame(0);
		
		// Draggable Web Element
		WebElement drag = driver.findElement(By.id("draggable"));
		
		// Droppable Web Element
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Drag and Drop using Action Class
		
	    Actions act = new Actions(driver);
	    
	    act.dragAndDrop(drag, drop).build().perform()
		
		Thread.sleep(2000);
		

		driver.close();
	
	}

}
