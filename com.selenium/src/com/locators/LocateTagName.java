package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateTagName 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
//		String a=driver.findElement(By.tagName("img")).getAttribute("alt");
//		System.out.println(a);
		
		System.out.println(driver.findElement(By.tagName("img")).getAttribute("alt"));
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		 List <WebElement> list_txt =driver.findElements(By.tagName("input"));
		 System.out.println(list_txt.size());
		 list_txt.get(2).sendKeys("vasant@gmail.com");
		 
		 List <WebElement> list_a =driver.findElements(By.tagName("a"));
		 System.out.println(list_a.size());
		 list_a.get(4).click();
		
	}
	
}
