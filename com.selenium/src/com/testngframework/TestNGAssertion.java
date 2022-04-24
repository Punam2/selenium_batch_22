package com.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion
{
	@Test
	public void test1()
	{
		System.out.println("test1()");
		Assert.assertTrue(true);
	}
	@Test
	public void test2()
	{
		System.out.println("test2()");
		Assert.assertTrue(false);
	}
	@Test
	public void test7()
	{
		System.out.println("test7()");
		Assert.assertFalse(true,"Expecting false but found true ");
	}
	@Test
	public void test8()
	{
		System.out.println("test8()");
		Assert.assertFalse(false,"Expecting false but found false ");
	}
	@Test
	public void test3()
	{
		System.out.println("test3()");
		Assert.assertTrue(false,"Expecting true but found false ");
	}
	@Test
	public void test4()
	{
		System.out.println("test4()");
		String exp="Hello All";
		String act="hello all";
		Assert.assertEquals(act, exp,"actual text is not matches with exp text");
	}
	@Test
	public void test5()
	{
		System.out.println("test5()");
		String exp="Hello All";
		String act="Hello All";
		Assert.assertEquals(act, exp,"actual text are matches with exp text");
	}
	
	
	
	
	
	
}