package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDD3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement month_dd= driver.findElement(By.name("birthday_month"));
		Select sel=new Select(month_dd);
		List<WebElement> list_value=sel.getOptions();
		int total_month=list_value.size();
		System.out.println(total_month);
		
//		//Approach-1
		for(int i=0;i<total_month;i++)
		{
			String month = list_value.get(i).getText();
			System.out.println(month);
			if(month.equals("Aug"))
			{
				list_value.get(i).click();
				break;
			}
		}
		HandleDD3.verifySelectedValue(month_dd,"Apr");
	}
	public static void verifySelectedValue(WebElement dropdown,String verifyddvalue)
	{
		List<WebElement>value=new Select(dropdown).getOptions();
		for(WebElement ele:value)
		{
			String month = ele.getText();
			if(month.equals(verifyddvalue))
			{
				ele.click();
				break;
			}
		}
	}

}
