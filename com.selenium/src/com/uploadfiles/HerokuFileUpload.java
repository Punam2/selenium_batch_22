package com.uploadfiles;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuFileUpload {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		String path="C:\\Users\\HP\\Desktop\\demo.docx";
		StringSelection sel =new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).click();
	}

}
