package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowserCommands 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("http://www.Facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 String title=driver.getTitle();
		 
		 System.out.println("Facebook title is=" +title);
		 
		 String url= driver.getCurrentUrl();
		 
		 System.out.println("The current url=" +url);
		 
		 String page_source=driver.getPageSource();
		 
		 System.out.println(page_source);
		 
	//	 driver.close();
		 
	//	 driver.quit();

	}

}
