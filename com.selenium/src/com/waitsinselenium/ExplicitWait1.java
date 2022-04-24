package com.waitsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.ByClassName.id("welcome")).click();
		WebElement signout = driver.findElement(By.xpath("//a[text()='Logout']"));
		
	//	waitUntilExpectedCond(driver,signout,2);
		waitUntilExpectedCond1(driver,"//a[text()='Logout']",1);
	}
	static void waitUntilExpectedCond(WebDriver driver,WebElement ele,long timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(ele)).click();
		
	}
	static void waitUntilExpectedCond1(WebDriver driver,String locator,long timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
	}
}
