package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {

		
		//setting the property of chrome browser and passing the chrome browser path
		
		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		//Implicit Wait
		
		//Thread.sleep(2000); we should avoid
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
		Thread.sleep(2000);
		
		// Handelling auto suggestion 
		
		List<WebElement> Allsuggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println("Total Elements Found : " + Allsuggestion.size());
		
		for(int i=0; i<Allsuggestion.size(); i++)
		{
			String expString = "How stuff works science";
			
			if(Allsuggestion.get(i).getText().equalsIgnoreCase(expString))
			{
				Allsuggestion.get(i).click();
				break;
			}
	
			Thread.sleep(2000);
			
		}
		
		
		driver.close();
	}

}
