package com.handlealertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
			//Alert box with ok button
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		String a=driver.findElement(By.id("result")).getText();
//		System.out.println(a);
		
		//Alert box with ok  and cancel button
		
//		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
////		alert.accept();
//		alert.dismiss();
//		System.out.println(driver.findElement(By.id("result")).getText());
//		
		//Alert box with ok  and cancel & text box
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Welcome to alert pop up");
		alert.accept();
	//	alert.dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);
	}
}
