package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateLinkText
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver  driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
	//	driver.findElement(By.linkText("Marketplace")).click();
		
		driver.findElement(By.partialLinkText("password?")).click();
		System.out.println(driver.getTitle());
	}

}
	