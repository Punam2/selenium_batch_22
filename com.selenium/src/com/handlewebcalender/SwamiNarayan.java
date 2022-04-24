package com.handlewebcalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwamiNarayan 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://shriswaminarayanbus.com/index.aspx");
		driver.manage().window().maximize();
		
		String Month="March 2022";
		String  day="12";
		driver.findElement(By.id("ctl00_btnClose")).click();
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtFromDate")).click();
		
		while(true)
		{
			String text=driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/thead/tr[1]/th[2]")).getText();
			System.out.println(text);
			if(Month.equals(text))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/thead/tr[1]/th[3]")).click();
			}
		}
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/tbody/tr[2]/td[6]")).click();
	}
}
