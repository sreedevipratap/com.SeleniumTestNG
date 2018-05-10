package com.Selenium.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import junit.framework.Assert;

public class WaitCommandsDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		
		WebDriverWait expwait = new WebDriverWait(driver,20);
		
		WebElement search =expwait.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		//explicit wait
		
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
		
		
	

	
			
	}

}
