package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDD4 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		
		List<WebElement> list_month = driver.findElements(By.xpath("//select[@title='Month']/option"));
		int month_count=list_month.size();
		System.out.println("Total month="+month_count);
		
		for(int i=0;i<month_count;i++)
		{
			System.out.println(list_month.get(i).getText());
			if(list_month.get(i).getText().equals("Apr"))
			{
				list_month.get(i).click();
				break;
			}
		}
	}
}
