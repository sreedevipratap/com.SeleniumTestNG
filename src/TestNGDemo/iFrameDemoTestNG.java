package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class iFrameDemoTestNG {
	public static WebDriver driver;
  @Test
  public void switchFrame() throws InterruptedException {
	  Thread.sleep(3000);
		driver.switchTo().frame("IF2");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-9\"]/div/div[1]/div/p[1]/a/img"));
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		

  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://toolsqa.com/iframe-practice-page/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText("Home")).click();
  }

  @BeforeClass
  public void beforeClass() {
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\sreed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	  
		driver.manage().window().maximize();
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
