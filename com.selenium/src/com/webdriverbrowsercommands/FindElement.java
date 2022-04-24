package com.webdriverbrowsercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 		 
		 driver.navigate().to("http://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 List<WebElement> ele=  driver.findElements(By.tagName("a"));
		 
		 int total=ele.size();
		 System.out.println("total no of anchor tag="+total);
		 
		 WebElement forgot_pwd= driver.findElement(By.linkText("Forgotten password?"));
		 forgot_pwd.click();
	}

}
