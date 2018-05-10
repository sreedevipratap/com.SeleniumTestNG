package TestNGDemo;

import org.testng.annotations.Test;

//import com.Selenium.Demo.DriverConfig;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestConfig {
 public static  WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  try {
		  System.out.println("In Before Test");
		  driver = DriverConfig.getDriver();
	  }
	  catch(Exception e){
		  System.out.println(e);
		  
	  }
  }

  @AfterTest
  public void afterTest() {
	System.out.println("inside aftertest");
	driver.quit();
  }

}
