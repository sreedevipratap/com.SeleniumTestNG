package com.Selenium.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/ ");
		
		String title = driver.getTitle();
		System.out.println("title of page is "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is "+currentUrl);
		
		driver.navigate().to("https://www.yahoo.com");
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().back();
		String titleBack = driver.getTitle();
		System.out.println(titleBack);
		
		driver.navigate().forward();
		String titleFwd = driver.getTitle();
		System.out.println(titleFwd);
		
		driver.navigate().refresh();
		String refresh = driver.getTitle();
		System.out.println(refresh);
		
		
		
	}

}
