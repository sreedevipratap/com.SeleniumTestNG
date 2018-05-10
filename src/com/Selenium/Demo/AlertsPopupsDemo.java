package com.Selenium.Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class AlertsPopupsDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/sreed/Downloads/prompt.html");
		
		
	driver.findElement(By.xpath("/html/body/fieldset/button")).click();
	
	Alert alert = driver.switchTo().alert();
	
			Thread.sleep(3000);
	
			String text = alert.getText();
			System.out.println(text);
			
			alert.sendKeys("Yes");
		Thread.sleep(3000);
			//alert.accept();
			
			alert.dismiss();
		
	}

}
