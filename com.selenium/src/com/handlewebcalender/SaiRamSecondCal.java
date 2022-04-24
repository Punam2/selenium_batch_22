package com.handlewebcalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SaiRamSecondCal
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://shrisairambus.com/index.aspx");
		driver.manage().window().maximize();
		String month_year="April 2022";
		String day = "16";
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtReturnDate")).click();
		while(true)
		{
			String text=driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/thead/tr[1]/th[2]")).getText();
			System.out.println(text);
			if(month_year.equals(text))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/thead/tr[1]/th[3]")).click();
			}
		}
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr[3]/td[6]")).click();
			
	}
}
