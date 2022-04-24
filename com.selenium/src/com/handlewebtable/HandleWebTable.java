package com.handlewebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
		System.out.println("Totle rows= "+ row+ "totle col= "+ col);
		 
		 //table[@id='customers']/tbody/tr[4][2]
		String before_xpath="//table[@id='customers']/tbody/tr[";
		String after_xpath="]/td[";
		String xpath="]";
		for (int i=2;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				//table[@id='customers']/tbody/tr[i]/td[j]
				String text=driver.findElement(By.xpath(before_xpath+i+after_xpath+j+xpath)).getText();
				System.out.print(text+"  | "+" | ");
			 }
			System.out.println(); 
		 }
	}
}
