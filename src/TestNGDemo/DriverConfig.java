package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfig {
	public static  WebDriver driver;

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		  
		driver.manage().window().maximize();
		
		driver.get("http://store.demoqa.com/");
		return driver;
		
	}

}
