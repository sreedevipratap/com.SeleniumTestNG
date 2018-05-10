package com.Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverDemo {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.ebay.in/ ");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title of page is "+title);
		
		WebElement deals=driver.findElement(By.xpath("//a[text()='Deals']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(deals).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Laptops")).click();
				
		
		
	}

}
