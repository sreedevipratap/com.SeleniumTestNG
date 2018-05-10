/*package com.Selenium.Demo;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenshotDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		screenshotCapture("newtours");
}

	private static void screenshotCapture(String title) throws IOException {
		// TODO Auto-generated method stub
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		
		File destFile = new File("C:\\Screenshot1\\" +title+ ".png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		
		
	}}*/
