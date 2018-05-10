package TestNGDemo;

import org.testng.annotations.Test;

//import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ClickLinksDemo {
	public static WebDriver driver;
	
/*  @Test
  public void Links() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("SIGN-ON")).click();	  
	  String actual = driver.getTitle();
	  String expected = "Sign-on: Mercury Tours";
	  
	  Assert.assertEquals(expected, actual);
	  System.out.println("Sign On");
  }*/
  @Test(priority=0)
  public void RegisterLink() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("REGISTER")).click();;
	  String actual = driver.getTitle();
	  String expected = "Register: Mercury Tours";
	  
	  Assert.assertEquals(expected, actual);
	  System.out.println("Register");
  }
  @Test(priority=1)
  public void SupportLink() throws InterruptedException {
	  Thread.sleep(3000);
	  
	  driver.findElement(By.linkText("SUPPORT")).click();
	  String actual = driver.getTitle();
	  String expected = "Under Construction: Mercury Tours";
	  
	  Assert.assertEquals(expected, actual);
	  System.out.println("Sry come again later");
  }
  @Test(priority=2)
  public void ContactLink() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("CONTACT")).click();
	  String actual = driver.getTitle();
	  String expected = "Under Construction: Mercury Tours";
	  
	  Assert.assertEquals(expected, actual);
	  System.out.println("Sry again ");
  }

  @BeforeMethod
  public void beforeMethod() {
	  //driver.findElement(By.linkText("SIGN-ON")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText("Home")).click();
  }

  @BeforeClass
  public void beforeClass() {
	 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\sreed\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  //driver = new FirefoxDriver();
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	  
	  driver.get("http://newtours.demoaut.com/");
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

}
