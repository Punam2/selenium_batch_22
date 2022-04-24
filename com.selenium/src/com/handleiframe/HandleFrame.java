package com.handleiframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		System.out.println("total no of iframe="+iframe.size());
		
	//	driver.switchTo().frame(0);
	//	driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")));
		
	//	WebElement x=driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
	//	driver.switchTo().frame(x);
	
		WebElement para = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		String a=para.getText();
		System.out.println(a);
		para.clear();
		para.sendKeys("Hello all, how r u?");
		
		driver.switchTo().defaultContent();
		WebElement ele = driver.findElement(By.linkText("Elemental Selenium"));
		System.out.println(ele.getText());
		ele.click();	
	}

}
