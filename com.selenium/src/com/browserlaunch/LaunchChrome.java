package com.browserlaunch;

import org.openqa.selenium.chrome.*;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");		
		
		driver.manage().window().maximize();
		
		
	}

}