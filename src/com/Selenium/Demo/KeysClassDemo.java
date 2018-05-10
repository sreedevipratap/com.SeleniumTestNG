package com.Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClassDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		WebElement search = driver.findElement(By.id("lst-ib"));
		search.sendKeys("Selenium");
		
		for(int i = 0;i<4;i++)
		{
			Thread.sleep(3000);
			search.sendKeys(Keys.DOWN);
		}
		
		
		search.sendKeys(Keys.ENTER);
	}

}
