package com.testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite()");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite()");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest()");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest()");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass()");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass()");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod()");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod()");
	}
	@Test
	public void test1()
	{
		System.out.println("Actual @ Test 1()");
	}
//	@Test
//	public void test2()
//	{
//		System.out.println("Actual @ Test 2()");
//	}
}
