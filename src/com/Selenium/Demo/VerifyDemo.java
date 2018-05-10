package com.Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class VerifyDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		String actual = driver.getTitle();
		String expected= "Google";
		
		if(actual.equals(expected))
		{
			
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		if(gmail.isDisplayed())
		{
			gmail.click();
	
		}
		else
		{
			System.out.println("link not found");
		}
		}
		else
		{
			System.out.println("Title not matching");
		}
		
		//boolean condition =gmail.isDisplayed();
		
		
		
		Thread.sleep(3000);
		
			
		
	}

}
