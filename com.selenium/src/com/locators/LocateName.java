package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateName
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vasant@123");
		driver.findElement(By.name("login")).click();
		
		String expMsg="The password that you've entered is incorrect. Forgotten password?";
		String actMsg=driver.findElement(By.className("_9ay7")).getText();
		if(expMsg.equals(actMsg))
		{
			System.out.println(actMsg);
			
		}
		else
		{
			System.out.println("Msg not verified");

		}
	}	

}
