package com.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGHardAndSoftAssert 
{
	@Test
	public void hardAssert1()
	{
		System.out.println("hardAssert1()");
		Assert.assertTrue(true);
		System.out.println("statement after hard assert execute only when assertion passed.");
	}
	@Test
	public void hardAssert2()
	{
		System.out.println("hardAssert2()");
		Assert.assertTrue(false);
		System.out.println("statement after hard assert execute only when assertion passed.");
	}
	@Test
	public void softAssert()
	{
			System.out.println("softAssert()");
			SoftAssert sa=new SoftAssert();
			sa.assertTrue(true);
			System.out.println("statement after hard assertion");
			
			sa.assertTrue(true);
			System.out.println("statement after hard assertion");
			
			sa.assertTrue(false);
			System.out.println("statement after hard assertion");
			
			sa.assertAll();
	}
}
