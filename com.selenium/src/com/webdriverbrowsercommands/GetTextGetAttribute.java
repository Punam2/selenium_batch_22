package com.webdriverbrowsercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextGetAttribute 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 		 
		 driver.navigate().to("http://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement txtUserName= driver.findElement(By.id("email"));
		 
		 String txtInnertext= txtUserName.getAttribute("placeholder");
		 
		System.out.println(txtInnertext);
		
		
		WebElement ele= driver.findElement(By.tagName("h2"));
		
		String h2_tag=ele.getText();
		
		String innerText=ele.getAttribute("innerHTML");
		
		System.out.println(innerText);
		System.out.println(h2_tag);
		
		List<WebElement> list_a=driver.findElements(By.tagName("a"));
		System.out.println("total no of link in fb login page="+list_a.size());
		
		for(int i=0;i<list_a.size();i++)
		{
			String linkText=list_a.get(i).getText();
			
			System.out.println(linkText);
			if(linkText.equals("Games"))
			{
				list_a.get(i).click();
				break;
			}
		}
//		for(WebElement element:list_a)
//		{
//			String text=element.getAttribute("innerHTML");
//			System.out.println(text);
//
//			if(text.equals("Sign up"))
//			{
//				element.click();
//				break;
//				
//			}
//		}
	
	}

}
