package com.handleauthiwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthiWindow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.linkText("Elemental Selenium")).getText());
	//	System.out.println(driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).getText());
	}

}
