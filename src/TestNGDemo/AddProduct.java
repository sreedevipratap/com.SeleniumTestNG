package TestNGDemo;

import org.testng.annotations.Test;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

//import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AddProduct {
	public static WebDriver driver;
  @Test(priority=1)
  public void addiPhone() throws InterruptedException {
	 // driver.findElement(By.xpath("//*[@id=\"default_products_page_container\"]/div[4]/div[2]/form/div[2]/div[1]/span/input")).click();
	// driver.findElement(By.xpath("//*[@id='menu-item-33']/a")).click();
	 WebElement products=driver.findElement(By.xpath("//a[text()='Product Category']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(products).build().perform();
		
		Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[text()='iPads']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"default_products_page_container\"]/div[3]/div[2]/form/div[2]/div[1]/span/input")).click();
	Thread.sleep(3000);
	 // driver.findElement(By.xpath("//a[text()='Magic Mouse']//parent::div//child::form//div[2]//input")).click();
  }
  @Test(priority=2)
  public void removeiPhone() throws InterruptedException {
	/* String cartVal =  driver.findElement(By.xpath("//*[@id=\"header_cart\"]/a")).getText();
	 System.out.println(cartVal+ ":cartVal");
	 String expected = "1 item |\n" + 
	 		"Cart\n" + 
	 		"Checkout";*/
	  Thread.sleep(3000);
	  
	 String cartVal = driver.findElement(By.xpath("//div[@id='header_cart']/a/em[1]")).getText();
			 //driver.findElement(By.xpath("//div[@id='header_cart']/a/em[1]")).getText();
	 Thread.sleep(3000);
	 // String cartVal = driver.findElement(By.xpath("//*[@id=\"header_cart\"]/a/em[1]")).getText();
	  System.out.println("The cartVal is :"+cartVal);
	  String expected = "1";
	Assert.assertEquals(expected, cartVal);
	
	driver.findElement(By.xpath("//div[@id=\"header_cart\"]/a/em[1]")).click();
	driver.findElement(By.xpath("//div[@id='checkout_page_container']//form/input[4]")).click();
	
	//chk this later-----driver.findElement(By.xpath("//*[@id=\"checkout_page_container\"]/div[1]/table/tbody/tr[2]/td[2]/a"))
	//driver.findElement(By.xpath("//*[@id=\"checkout_page_container\"]/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")).click();
  }
 /* @BeforeClass
  public void beforeClass()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedevi Pratap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
driver.manage().window().maximize();
		
		driver.get("http://store.demoqa.com/");
  }*/
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver=TestConfig.driver;
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='All Product']")).click();
  }

  @AfterMethod
  public void afterMethod() {
  }
  /*
  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }
*/
}
