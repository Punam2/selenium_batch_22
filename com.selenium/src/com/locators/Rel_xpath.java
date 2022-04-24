package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rel_xpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vasant@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vasant123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
//		driver.findElement(By.xpath("//button[@id='u_0_d_7m']")).click();
		
//		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("vasant@gmail.com");
//		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("vasant123");
//		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}

}
