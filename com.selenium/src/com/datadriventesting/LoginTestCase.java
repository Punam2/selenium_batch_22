package com.datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCase extends TestBase
{
	@Test(dataProvider = "getTestData")
	
	public void verifyLogin(String username,String password)
	{
			
		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys(username);
		 WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		
		if(driver.getPageSource().contains("Dashboard"))
		{
			Assert.assertTrue(true);
		}
		else if(driver.getPageSource().contains("LOGIN Panel"))
		{
			Assert.assertTrue(false);
		}
	}
	
	@DataProvider
	public String[][] getTestData()
	{
		String [][]data=new String[3][2];
		
		data[0][0]= "Admin";
		data[0][1]= "admin123";
		
		data[1][0]= "Admin12";
		data[1][1]= "admin$";
		
		data[2][0]= "Admin67";
		data[2][1]= "admin^";
		
		 
		return data;
	}
}

