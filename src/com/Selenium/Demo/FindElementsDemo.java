package com.Selenium.Demo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FindElementsDemo {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.in/ ");
		
		String title = driver.getTitle();
		System.out.println("title of page is "+title);
		
		//WebElement deals=driver.findElement(By.xpath("//a[text()='Deals']"));
		
		Actions action = new Actions(driver);
		
		//action.moveToElement(deals).build().perform();
		
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.cssSelector("a.rt"));
		
		for(WebElement link:links)
		{
			action.moveToElement(link).build().perform();
			String t = link.getText();
			System.out.println(t);
			
		}
				
		
		
	}

}
