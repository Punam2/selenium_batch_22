package com.handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDD {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
	//	 System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement dd= driver.findElement(By.name("birthday_day"));
		WebElement mm= driver.findElement(By.name("birthday_month"));
		WebElement yy= driver.findElement(By.name("birthday_year"));
		
		Select sel1= new Select(dd);
		sel1.selectByIndex(21);
	//	sel1.selectByValue("10");
	//	sel1.selectByVisibleText("26");
		
		Select sel2= new Select(mm);
		sel2.selectByIndex(6);
	//	sel2.selectByValue("9");
	//	sel2.selectByVisibleText("Jul");
		
		Select sel3= new Select(yy);
	//	sel3.selectByIndex(21);
	//	sel3.selectByValue("1997");
		sel3.selectByVisibleText("1992");
	}
}
