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

public class LoginSignOn {
	public static WebDriver driver;
	
  @Test
  public void signIn() {
	  
	  driver.findElement(By.name("userName")).sendKeys("test2");
	  driver.findElement(By.name("password")).sendKeys("pwd2");
	  driver.findElement(By.name("login")).click();
	  String actual = driver.getTitle();
	  System.out.println("actual");
	  System.out.println(actual);
	  String expected = "Sign-on: Mercury Tours";
	  
	  Assert.assertEquals(actual, expected);
  }
 /* @Test
  public void signIn1() {
	  
	  driver.findElement(By.name("userName")).sendKeys("test2");
	  driver.findElement(By.name("password")).sendKeys("pwd2");
	  driver.findElement(By.name("login")).click();
  }
  @Test
  public void signIn2() {
	  
	  driver.findElement(By.name("userName")).sendKeys("test2");
	  driver.findElement(By.name("password")).sendKeys("pwd2");
	  driver.findElement(By.name("login")).click();
  }*/
  @BeforeMethod
  public void beforeMethod() {
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText("Home")).click();
  }

  @BeforeClass
  public void beforeClass() {
	 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\sreed\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	 // driver = new FirefoxDriver();
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	  
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  
	  		
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
