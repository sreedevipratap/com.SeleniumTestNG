package com.Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByDemo {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		  
		
		
		driver.get("https://www.google.co.in/ ");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title of page is "+title);
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		//WebElement search = driver.findElement(By.id("q"));
		//search.sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input")).click();
		
		
		
		
		
	}

}
