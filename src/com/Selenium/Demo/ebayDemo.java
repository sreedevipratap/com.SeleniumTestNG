package com.Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//import junit.framework.Assert;

public class ebayDemo {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.in/");
		
		WebElement cameras = driver.findElement(By.xpath("//a[text()='Cameras']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(cameras).build().perform();
		
		Thread.sleep(3000);
		
		WebElement digicam = driver.findElement(By.partialLinkText("Digital"));
		digicam.click();
		
		//digicam.sendKeys(Keys.DOWN);
		//digicam.sendKeys(Keys.ENTER);
		
		WebElement nikon = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
		nikon.sendKeys("nikon");
		
		for(int i=0;i<6;i++)
		{
		Thread.sleep(3000);	
		nikon.sendKeys(Keys.DOWN);
		
		}
		
		nikon.sendKeys(Keys.ENTER);
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "nikon d5600 | eBay";
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		WebElement dslr = driver.findElement(By.xpath("//*[@id=\"item1c7584db85\"]/h3/a"));
		dslr.click();
		
		WebElement Cart = driver.findElement(By.id("isCartBtn_btn"));
		
		Assert.assertTrue(Cart.isEnabled());
		
		Cart.click();
		
		
		
		
		
		
		
	}

}
