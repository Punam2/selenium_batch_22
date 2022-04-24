package com.webdriverbrowsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		// driver.get("http://facebook.com/");
		 
		 driver.navigate().to("http://facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 
		 String title1 =driver.getTitle();
		 System.out.println(title1);
		 
		 driver.navigate().back();
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().refresh();
		 
		 driver.close();
	}

}
