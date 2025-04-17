package javaPackage;

import org.testng.annotations.*;

public class TestNG1 {
	
	@Test
	public void a2()
	{
		System.out.println("hello a2 method");
	}

	@BeforeTest
	public void b()
	{
		System.out.println("hello b method");
	}
	
	@BeforeTest
	public void c()
	{
		System.out.println("hello c method");
	}
	
	@AfterMethod
	public void d()
	{
		System.out.println("hello d method");
	}
	@BeforeClass
	public void e()
	{
		System.out.println("hello e method");
	}
	
	@AfterTest
	public void f()
	{
		System.out.println("hello f method");
	}
	
	@AfterClass
	public void g()
	{
		System.out.println("hello g method");
	}
	
	@BeforeMethod
	public void h()
	{
		System.out.println("hello h method");
	}
	
	@AfterSuite
	public void i()
	{
		System.out.println("hello  miethod");
	}
	
	@Test
	public void a1()
	{
		System.out.println("hello a1 method");
	}
	
	@Test 
	public void A1()
	{
		System.out.println("hello A1 method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello main method");
	}
	
}
