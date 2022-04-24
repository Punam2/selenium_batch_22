package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting
{
	
	static WebDriver driver;
	public static void launchBrowser(String browsername,String url)
	{
		if(browsername.equals("Chrome"))	
		{
			 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			 
			 driver =new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			
			driver = new FirefoxDriver(); 
		}
		driver.get(url);
	}

	public static void main(String[] args) 
	{
		
		CrossBrowserTesting.launchBrowser("Chrome","http://www.gmail.com/");
		
		CrossBrowserTesting.launchBrowser("Firefox","http://www.google.com/");
	}

}
