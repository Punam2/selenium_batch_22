package com.handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDD1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement dd= driver.findElement(By.name("birthday_day"));
		WebElement mm= driver.findElement(By.name("birthday_month"));
		WebElement yy= driver.findElement(By.name("birthday_year"));
		
		HandleDD1.selectByIndex1(dd,20);
		HandleDD1.selectByIndex1(mm,7);
		HandleDD1.selectByIndex1(yy,30);
		Thread.sleep(5000);
		HandleDD1.selectByValue1(dd,"10");
		HandleDD1.selectByValue1(mm,"8");
		HandleDD1.selectByValue1(yy,"1996");
		Thread.sleep(5000);

		HandleDD1.selectByVisibleText1(dd,"5");
		HandleDD1.selectByVisibleText1(mm,"2");
		HandleDD1.selectByVisibleText1(yy,"1992");
	}	
		
	public static void selectByIndex1(WebElement dropdown,int index)
	{
		new Select(dropdown).selectByIndex(index);
	}
	public static void selectByValue1(WebElement dropdown,String value)
	{
		new Select(dropdown).selectByValue(value);
	}
	public static void selectByVisibleText1(WebElement dropdown,String visibletext)
	{
		new Select(dropdown).selectByValue(visibletext);
	}
	
}
