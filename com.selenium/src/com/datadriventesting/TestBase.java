package com.datadriventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class TestBase 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource-demo.orangehrmlive.com/");
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		//Thread.sleep(5000);
		driver.quit();
	}
	
}
