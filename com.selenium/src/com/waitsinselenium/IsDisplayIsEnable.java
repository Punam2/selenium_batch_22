package com.waitsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayIsEnable {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.linkText("Sign Up"));
		boolean status=signup.isDisplayed();
		if(status)
		{
			signup.click();
			
		}
		
		WebElement male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		if(male.isEnabled())
		{
			male.click();
		}
		WebElement female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		if(female.isEnabled())
		{
			female.click();
		}
		else
		{
			female.click();
		}
	}

}
