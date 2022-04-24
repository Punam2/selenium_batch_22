package com.browserlaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com/");
	}

}
