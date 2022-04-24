
package com.handleiframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		List<WebElement> framelist = driver.findElements(By.tagName("frame"));
		System.out.println("list of frame are="+framelist.size());
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top").switchTo().frame("frame-right");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top").switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
	}

}
