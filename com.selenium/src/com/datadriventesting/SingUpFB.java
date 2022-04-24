package com.datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingUpFB extends TestBase1 
{

	@Test(dataProvider = "getTestData")
	
	public void verifyLogin(String fname,String lname,String email,String re_email,String pass,String dd,String mm,String yy)
	{
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(re_email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
		driver.findElement(By.className("_58mt")).click();  //radiobutton

		driver.findElement(By.name("birthday_day")).sendKeys(dd);
		driver.findElement(By.name("birthday_month")).sendKeys(mm);;
		driver.findElement(By.name("birthday_year")).sendKeys(yy);
	}
	
	
	@DataProvider
	public String[][] getTestData()
	{
		
		String [][]data=new String[1][8];
		
		data[0][0]= "Punam";
		data[0][1]= "Kharche";
		
		data[0][2]= "Punam@gmail.com";
		data[0][3]= "Punam@gmail.com";
		data[0][4]= "Punam123$";
		
		data[0][5]= "28";
		data[0][6]= "Nov";
		data[0][7]= "1992"; 
		return data;
	}
}

