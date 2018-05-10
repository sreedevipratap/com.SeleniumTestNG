package com.Selenium.Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowHandleDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement Sam=driver.findElement(By.id("twotabsearchtextbox"));
				Sam.sendKeys("SAMSUNG");
		Sam.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("img.s-access-image.cfMarker")).click();
		
		String handle = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();
		
		handles.remove(handle);
		
		String newhandle = handles.iterator().next();
		driver.switchTo().window(newhandle);
		
	/*	for(String handle1:driver.getWindowHandles())
		{
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}*/
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.switchTo().defaultContent();

	}

}
