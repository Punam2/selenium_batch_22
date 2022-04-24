package com.testngframework;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addition 
{
	@Test
	@Parameters({"a","b"})
	public void paraTest(@Optional("10")int a,@Optional("20")int b) 
	{
		System.out.println("Addition="+(a+b));
	}
}
