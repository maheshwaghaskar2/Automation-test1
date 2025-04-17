package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lect49Assertion3 {
	
	
	@Test
	public void testCase3()
	{
		
		String actualText = "abc";
		String expectedText = "ab";
		
		
		//Equal Assertion
		
		try {
			Assert.assertEquals(actualText, expectedText," Actual and expected are not matching");
		} catch (Error e) {
			
		}
		System.out.println("Equal Assertion is varified");
	}

}
