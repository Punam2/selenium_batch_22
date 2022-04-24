package com.webdriverbrowsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavigateToCommand 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		// driver.get("http://www.facebook.com/");
		 
		 driver.navigate().to("http://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
