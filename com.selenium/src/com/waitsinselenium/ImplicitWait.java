package com.waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("punam");
		driver.findElement(By.name("lastname")).sendKeys("kharche");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("punam@123$");
		driver.findElement(By.name("reg_email__")).sendKeys("punam@gmail.com");
		driver.quit();
	}

}
