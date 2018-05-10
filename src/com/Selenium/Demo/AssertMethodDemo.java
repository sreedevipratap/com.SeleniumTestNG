package com.Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import junit.framework.Assert;

public class AssertMethodDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		String actual = driver.getTitle();
		String expected= "Google";
		
		Assert.assertEquals(actual,expected);
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		//boolean condition =gmail.isDisplayed();
		
		Assert.assertTrue(gmail.isDisplayed());
		
		Thread.sleep(3000);
		
			
		
		gmail.click();
		
		Thread.sleep(3000);
		

		driver.close();
	}

}
