package com.webdriverbrowsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitClosecommands 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("http://naukri.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.close();
		 
	//	 driver.quit();
	}

}
