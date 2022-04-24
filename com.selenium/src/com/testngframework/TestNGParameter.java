package com.testngframework;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class TestNGParameter 
{
	@Test
	@Parameters({"username","password"})
	public void paraTest(@Optional("Admin")String username,@Optional("admin123")String password) 
	{
		System.out.println(username);
		System.out.println(password);
	}
	
}
