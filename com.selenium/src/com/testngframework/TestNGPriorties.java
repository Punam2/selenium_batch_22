package com.testngframework;

import org.testng.annotations.Test;

public class TestNGPriorties
{
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login Test()");
	}
	@Test(priority=2)
	public void createAccount()
	{
		System.out.println("createAccount()");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logout Test()");
	}
}
