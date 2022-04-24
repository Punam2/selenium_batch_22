package com.handlewebcalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SsiRamFirstCal {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://shrisairambus.com/index.aspx");
		driver.manage().window().maximize();
		String month_year="March 2022";
		String day = "16";
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtFromDate")).click();
		while(true)
		{
			String my_text=driver.findElement(By.xpath("/html/body/div[1]/div[3]/table/thead/tr[1]/th[2]")).getText();
			System.out.println(my_text);
			if(my_text.equals(month_year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/table/thead/tr[1]/th[3]")).click();
			}
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/table/tbody/tr[3]/td[3]")).click();
	}

}
