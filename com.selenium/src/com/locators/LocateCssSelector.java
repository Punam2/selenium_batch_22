package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateCssSelector 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.cssSelector("._8eso")).getText());
		driver.findElement(By.cssSelector("#email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("vasant@123");
	}

}
