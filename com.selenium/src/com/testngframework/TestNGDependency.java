package com.testngframework;

import org.testng.annotations.Test;

public class TestNGDependency 
{
	@Test
	public void login()
	{
		System.out.println("Login Test()");
	}
	
	@Test(dependsOnMethods="login")
	public void createAccount()
	{
		System.out.println("createAccount()");
	}
	
	@Test(dependsOnMethods={"login","createAccount"})
	public void logout()
	{
		System.out.println("Logout Test()");
	}

}
