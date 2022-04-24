package com.handlewebcalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String month_year="May 2022";
		String day = "12";
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		while(true)
		{
			String my_text=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
		//	WebElement ele=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]"));
		//	String my_text = ele.getText();
			if(my_text.equals(month_year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]")).click();
			}
		}
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td[@class='wd day'and text()="+day+"]")).click();
	}
}
