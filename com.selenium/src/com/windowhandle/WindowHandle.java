package com.windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://the-internet.herokuapp.com/windows");
		 String parent = driver.getWindowHandle();
		 
		 System.out.println(parent);
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.linkText("Click Here")).click();
		 Set<String> windows=driver.getWindowHandles();
		 
		 int total_windows=windows.size();
		 System.out.println(total_windows);
		 
		 Object[]arr=windows.toArray();
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 
		 driver.switchTo().window((String)arr[1]);

		driver.get("http://facebook.com/");
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window((String)arr[0]);
		 System.out.println(driver.getTitle());
		 
	}

}
