package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginTest {
	public static WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver = TestConfig.driver;
	  driver.findElement(By.xpath("//*[@id=\"account\"]/a")).click();
	  
  }
  @Test(priority=1)
  public void Login1() throws InterruptedException {
	  //driver = TestConfig.driver;
	  driver.findElement(By.name("log")).sendKeys("sree1");
	  driver.findElement(By.name("pwd")).sendKeys("pass1");
	  Thread.sleep(3000);
	  driver.findElement(By.name("submit")).click();
	 Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\"ajax_loginform\"]/p[1]")).getText();
	  System.out.println(actual);
	  String expected = "ERROR: Invalid username. Lost your password?";
	  Thread.sleep(3000);
	  
	  Assert.assertEquals(actual, expected);
  }
  @Test(priority=2)
  public void Login2() throws InterruptedException {
	  //driver = TestConfig.driver;
	  driver.findElement(By.name("log")).clear();
	  driver.findElement(By.name("pwd")).clear();
	  
	  driver.findElement(By.name("log")).sendKeys("sree2");
	  driver.findElement(By.name("pwd")).sendKeys("pass2");
	  Thread.sleep(3000);
	  driver.findElement(By.name("submit")).click();
	 Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\"ajax_loginform\"]/p[1]")).getText();
	  System.out.println(actual);
	  String expected = "ERROR: Invalid username. Lost your password?";
	  Thread.sleep(3000);
	  
	  Assert.assertEquals(actual, expected);
  }
  @AfterClass
  public void afterClass() {
	  driver.findElement(By.xpath("//*[@id=\"menu-item-15\"]/a")).click();
  }
 
}
