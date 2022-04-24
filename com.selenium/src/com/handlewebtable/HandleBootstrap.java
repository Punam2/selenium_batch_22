package com.handlewebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrap {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println("Title of page="+ driver.getTitle());
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='welcome-menu']/ul/li/a"));
		
		//	HandleBootstrap.handleDropdown(list,"Logout");
		for(WebElement ele:list)
		{
			String a=ele.getText();
			System.out.println(a);
			if(ele.getText().equals("Support"))
			{
				ele.click();
				break;
			}
		}
	}
	
	public static void handleDropdown(List<WebElement> list, String value)
	{
		for(WebElement ele:list)
		{
			String a=ele.getText();
			System.out.println(a);
			if(ele.getText().equals("value"))
			{
				ele.click();
				break;
			}
		}
	}
}

