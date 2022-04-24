package com.datadriventesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestDemo 
{
	@Test(dataProvider="TestData")
	public void getTestData(String username,String password)
	{
		System.out.println("The username is="+username);
		System.out.println("The password is="+password);
	}
	
	@DataProvider(name="TestData")
	public String[][] testData()
	{
		String[][] data=new String[3][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";	
		
		data[1][0]="Admin12";
		data[1][1]="admin456";	
		
		data[2][0]="Admin78";
		data[2][1]="admin";	
		
		return data;
	}
	
	@Test(dataProvider = "prepareData")
	public void getData(Object name,Object pass,Object eid)
	{
		System.out.println("username="+name);
		System.out.println("password="+pass);
		System.out.println("Eid="+eid);
	}
	
	@DataProvider
	public Object[][] prepareData()
	{
		Object[][] data=new Object[3][3];
		
		data[0][0]="Vasant@gmail.com";
		data[0][1]="vasant123";
		data[0][2]=111;
		
		data[1][0]="vaishali@gmail.com";
		data[1][1]="vaishali456";
		data[1][2]=112;
		
		data[2][0]="varsha@gmail.com";
		data[2][1]="varsha789";
		data[2][2]=112;
		
		return data;
	}
}
