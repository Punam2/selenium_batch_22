package com.handlealertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uid")).sendKeys("mngr34139_");
		driver.findElement(By.name("password")).sendKeys("vYmajuh");
		driver.findElement(By.name("btnLogin")).click();
		
		handleAlert(driver);
		
		driver.findElement(By.name("uid")).sendKeys("mngr341390");
		driver.findElement(By.name("password")).sendKeys("vYmajuh");
		driver.findElement(By.name("btnLogin")).click();
		
		handleAlert(driver);

		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		handleAlert(driver);

	}
	public static void handleAlert(WebDriver driver)
	{
		if(isAlertPresent(driver))
		{
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
	}
	public static boolean isAlertPresent(WebDriver driver)
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("No Alert present="+e.getMessage());
			return false;
		}
	}
}
