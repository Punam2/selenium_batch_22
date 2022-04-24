package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDD5
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		
		List<WebElement> day = driver.findElements(By.xpath("//select[@title='Day']/option"));
		List<WebElement> month = driver.findElements(By.xpath("//select[@title='Month']/option"));
		List<WebElement> year = driver.findElements(By.xpath("//select[@title='Year']/option"));
		
		HandleDD5.handleDropdown(day,"12");
		HandleDD5.handleDropdown(month,"May");
		HandleDD5.handleDropdown(year,"2021");
	}
	public static void handleDropdown(List<WebElement> list,String value)
	{
		for(WebElement dropdown:list)
		{
			if(dropdown.getText().equals(value))
			{
				dropdown.click();
				break;
			}
		}
	}
}
