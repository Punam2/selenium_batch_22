package com.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriortiseVsDependsOnMethod 
{
	@Test(priority=1)
	public void test1()
	{
		System.out.println("test1()");
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("test2()");
		Assert.assertTrue(false);
	}
	@Test(priority=3)
	public void test3()
	{
		System.out.println("test3()");
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods="test1")
	public void test4()
	{
		System.out.println("test4()");
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods= {"test1","test2"})
	public void test5()
	{
		System.out.println("test5()");
		Assert.assertTrue(true);
	}
}
