package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Lect_39 {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver","E:\\Shami Jha\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//1st way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total Dropdown Values" + birthMonth.size());
		birthMonth.get(1);
		Thread.sleep(2000);
		birthMonth.get(8).click();
		
		//2ne Way
		
		WebElement bm= driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month = new Select(bm);
		Thread.sleep(2000);
		
		month.selectByVisibleText("Feb");
		Thread.sleep(2000);

		month.selectByValue("3");
		Thread.sleep(2000);

		month.selectByIndex(3);
		Thread.sleep(2000);

		System.out.println(month.getFirstSelectedOption().getText());
		
		//3rd Way
		
		List<WebElement> dropdown = month.getOptions();
		System.out.println(dropdown.size());
		for(int i=0; i<dropdown.size(); i++) 
		{
		
			if(dropdown.get(i).getText().equalsIgnoreCase("sep"))
			{
				dropdown.get(i).click();
			}
		}
		
		//4th way
		
		Thread.sleep(2000);
        WebElement bm1 = driver.findElement(By.xpath("//select[@id= 'month']"));
        bm1.sendKeys("Jul");
        
        //5th way
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@id= 'month']")).sendKeys("Jun");
		
		//Check if dropdown support multi selecton
		
		System.out.println(month.isMultiple());
		//month.selectByVisibleText("Mar");
		//month.selectByValue("4");
		//month.selectByIndex(4);
		
		// Deselect the multi selected value from dropdown
		
		//month.deselectByVisibleText("Mar");
		//month.deselectByValue("4");
		//month.deselectByIndex(4);
				
		
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
