package com.testngframework;

import org.testng.annotations.Test;

public class GroupInTestNG
{
	@Test(groups= {"sanity"})
	public void test1() 
	{
		System.out.println("test1():gropus={\"sanity\"}");
		
	}
	@Test(groups= {"regression"})
	public void test2()
	{
		System.out.println("test2:groups={\"regression\"}");
	}
	@Test(groups= {"regression","smoke"})
	public void test3()
	{
		System.out.println("test3:groups={\"regression\",\"smoke\"}");
	}
	@Test(groups= {"smoke"})
	public void test4()
	{
		System.out.println("test4:(groups= {\"smoke\"})");
	}
}
