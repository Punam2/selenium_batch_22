package com.capturescreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen {
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txt_user=driver.findElement(By.name("email"));
		WebElement pass=driver.findElement(By.name("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		txt_user.sendKeys("vasant@gmail.com");
		pass.sendKeys("vasant@223$");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/fb_loginpunam.png");
		
		FileHandler.copy(source, dest);
		loginBtn.click();
		
		File source1=ts.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./Screenshots/fb_homepagepunam.png");
		FileHandler.copy(source1, dest1);
		
	}

}

