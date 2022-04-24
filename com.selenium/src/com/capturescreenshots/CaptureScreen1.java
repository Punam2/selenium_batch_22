package com.capturescreenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen1 {

	public static void main(String[] args)
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
		
		CaptureScreenshot(driver,"loginpage");
		loginBtn.click();
		CaptureScreenshot(driver,"hpage");
		driver.quit();
	}

	public static void CaptureScreenshot(WebDriver driver,String name)
	{
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshots/"+name+".png");
			FileHandler.copy(source, dest);
			System.out.println("Screen shot captured succeefully!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Screen shot not captured succeefully!!!");
		}
	}
}
