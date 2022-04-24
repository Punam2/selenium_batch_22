package com.handleiframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://dashboard.paytm.com/login/?referrer=Business");
		driver.get("https://paytm.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("_1DP5L")).click();
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		System.out.println("total no of frames are = " +iframe.size());
		
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("//p[@class='heading']"));
		System.out.println(ele.getText());
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div/div[1]/div/div/div[1]/ul/li[1]/span[2]"));
	//	System.out.println(a.getText());
		
		WebElement b=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div/div[1]/div/div/div[1]/ul/li[2]/span[2]"));
	//	System.out.println(b.getText());
		
	//	System.out.println(driver.findElement(By.xpath("//div[@class='cta-description']")).getText());
		
	//	System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		
	//	System.out.println(driver.findElement(By.className("ng-scope")).getText());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='main-container']/div/div/div/div/div/div[1]/div/div/div[3]/div[2]/a[2]")).getText());
		
		driver.quit();
	
	}

}
