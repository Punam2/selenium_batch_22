package com.handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDD2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement month_dd= driver.findElement(By.name("birthday_month"));
		
		Select sel=new Select(month_dd);
		WebElement ele = sel.getFirstSelectedOption();
		String beforeselect = ele.getText();
		System.out.println("before selected value is="+beforeselect);
		
		
		
		sel.selectByVisibleText("Feb");
		WebElement ele1 = sel.getFirstSelectedOption();
		String afterselect = ele1.getText();
		System.out.println("after selected value is="+afterselect);


	}

}
