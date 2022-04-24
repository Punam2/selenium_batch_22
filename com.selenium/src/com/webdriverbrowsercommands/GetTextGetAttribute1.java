package com.webdriverbrowsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextGetAttribute1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 		 
		 driver.navigate().to("http://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement txtUserName= driver.findElement(By.name("email"));
		 
		 String txtInnertext= txtUserName.getAttribute("placeholder");
		 
		System.out.println(txtInnertext);

		 WebElement txtPass= driver.findElement(By.name("pass"));
		
		 String txtInnertext1= txtPass.getAttribute("placeholder");

		System.out.println(txtInnertext1);
		
		WebElement ele= driver.findElement(By.tagName("h2"));
			
		String h2_tag=ele.getText();
			
		String innerText=ele.getAttribute("innerHTML");
		System.out.println(innerText);
		System.out.println(h2_tag);
		
		
			
			

	}

}
