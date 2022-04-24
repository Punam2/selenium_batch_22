package com.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting 
{
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void launchBrowser(@Optional("Chrome")String browser)
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Browser exe doesn't match");
		}
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		
	}
	
}
