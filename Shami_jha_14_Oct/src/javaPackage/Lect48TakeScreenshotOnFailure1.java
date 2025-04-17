package javaPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Lect48TakeScreenshotOnFailure1 {
	
	WebDriver driver;
	
	//ITestResult will provide us the Test case execution status and test case name 
	
	public void captureScreenshot(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE == result.getStatus()) {
			
		//create ref of TakeScreenshot Interface and Type Casting
		
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
		 //use getScreenshotAs() to capture screenshot in File format
		 //getScreenshotAs() method return type = File
		 
		 File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		 
		 //copy the file to specific location
		 
		 File destFolder = new File("./screenshots/" + result.getName() + ".png");
		 
		 FileUtils.copyFile(sourceFile, destFolder);
		 
		 System.out.println(result.getName() + "method() failed , screenshot captured");
		} 
	}
	

}
