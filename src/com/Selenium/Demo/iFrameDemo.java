package com.Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameDemo {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		//driver.findElement(By.id("IF2"));
		Thread.sleep(3000);
		driver.switchTo().frame("IF2");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-9\"]/div/div[1]/div/p[1]/a/img"));
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Home")).click();
		

	}

}
