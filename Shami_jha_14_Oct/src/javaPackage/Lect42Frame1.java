package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect42Frame1 {

	public static void main(String[] args) {

		{
			System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					driver.get("https://www.paytm.com/");
					
					// Find the total no of frame present on webpage
					
					int allFrame = driver.findElements(By.tagName("iframe")).size();
					
					System.out.println("Total frame : "+allFrame);
					
					// Check if the element is present or not 
					
					for(int i=0;i<allFrame;i++) 
					{
						driver.switchTo().frame(i);
						driver.switchTo().frame(i);
						
						String expText = "Open Paytm App";
						
						String actText = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
						
						if(actText.equalsIgnoreCase(expText))
						{
							
							System.out.println("Element Found");
							break;
								
						}
						else
						{
							System.out.println("Element not Found");
						}
						
					}
					
					
					driver.close();
		
	}

}
	}
