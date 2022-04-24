package com.handlewebcalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		
		String month_year="May 2022";
		String day = "12";
		
		driver.findElement(By.xpath("//*[@id='d1-btn']")).click();
		while(true)
		{
			String monthyear = driver.findElement(By.xpath("//div[@class='uitk-date-picker-menu-months-container']/div/h2")).getText(); //february 2022-->
			System.out.println(monthyear);
			if(monthyear.equals(month_year))
			{
				break;  
			}
			else
			{
				//click on next button
				driver.findElement(By.xpath("//*[@id='wizard-hotel-pwa-v2-1']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]")).click(); 
			}
		}
		//driver.findElement(By.xpath("//*[@id='wizard-hotel-pwa-v2-1']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr/td/button[@data-day="+day+"]")).click();
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='wizard-hotel-pwa-v2-1']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr/td/button[@data-day="+day+"]"));
		ele.click();
	}
	
}
