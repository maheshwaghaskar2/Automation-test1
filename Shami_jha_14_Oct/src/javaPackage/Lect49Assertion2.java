package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lect49Assertion2 {
	
	@Test
	public void testCase2()
	{
		
		String actualText = "abc";
		String expectedText = "ab";
		
		int a = 10;
		int b = 20;
		
		//Equal Assertion
		
		Assert.assertEquals(actualText, expectedText,"Actual and expected are not matching");
		System.out.println("Equal Assertion is varified");
		
		//False Assertion
		
		Assert.assertFalse(a>b);
		System.out.println("False Assertion is varified");
		
		//True Assertion
		
		Assert.assertTrue(a>b);
		
		//Assertion failed here and Test execution will stop here
		//Further line of code will not execute
		
		System.out.println("True assertion is varified");;
		
	}
	
	@Test
	public void testCase3()
	{
		
		//Assertion is written in testcase2() method
		// Scope of assertion will be limeted to testcase2() method only
		
		System.out.println("Hello tesCase3() method");
		
	}

}
