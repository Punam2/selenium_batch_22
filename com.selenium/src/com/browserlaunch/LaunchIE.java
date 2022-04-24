package com.browserlaunch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.google.com/");

	}

}