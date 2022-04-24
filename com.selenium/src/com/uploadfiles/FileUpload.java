package com.uploadfiles;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String filepath="C:\\Users\\HP\\Desktop\\demo.docx";
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
		
		StringSelection sel=new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
		Robot robot = new Robot();
		Thread.sleep(5000);
		
	
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.id("processTaskTextBtn")).click();
	}

}
