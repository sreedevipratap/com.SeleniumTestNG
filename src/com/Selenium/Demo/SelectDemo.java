package com.Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.in/ ");
		
		String title = driver.getTitle();
		System.out.println("title of page is "+title);
		
		//driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		//search.sendKeys("Selenium");
		Thread.sleep(3000);
		Select sel=new Select(dropdown);
		
		//sel.selectByVisibleText("Automotive");
		sel.selectByValue("293");
		//sel.selectByIndex(2);
		
				
	}

}
