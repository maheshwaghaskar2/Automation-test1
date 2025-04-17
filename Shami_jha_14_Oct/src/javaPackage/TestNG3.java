package javaPackage;

import org.testng.annotations.Test;

public class TestNG3 {
	
	//Sequencing and priorities Test Scripts
	
	@Test(priority=-10)
	public void a()
	{
		System.out.println("hello a method");
	}

	@Test(priority=2)
	public void b()
	{
		System.out.println("hello b method");
	}
	
	@Test(priority=0)
	public void c()
	{
		System.out.println("hello c method");
	
	}
	
	@Test
	public void d()
	{
		System.out.println("hello d method");
	}

}
