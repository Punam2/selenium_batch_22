package com.waitsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumWaits {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("punam");
		Thread.sleep(4000);
		driver.findElement(By.name("lastname")).sendKeys("kharche");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("punam@123$");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_email__")).sendKeys("punam@gmail.com");
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
