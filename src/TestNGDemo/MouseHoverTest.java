package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class MouseHoverTest {
	public static WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  driver = TestConfig.driver;
	 WebElement pdt =  driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"));
	  
	  Actions act = new Actions(driver);
	  act.moveToElement(pdt).build().perform();
  }
@Test
public void accessories() throws InterruptedException
{
	driver.findElement(By.xpath("//a[@href = 'http://store.demoqa.com/products-page/product-category/accessories/']")).click();
	//driver.findElement(By.xpath("//a[text()='Accessories']")).click();
	Thread.sleep(3000);
	String actual = driver.getTitle();
	System.out.println("accessoriestitle : "+actual);
	String expected = "Accessories | ONLINE STORE";
	
	Assert.assertEquals(actual, expected);
	
}
/*@Test
public void iMacs() throws InterruptedException
{
	//driver.findElement(By.xpath("//a[@herf = 'http://store.demoqa.com/products-page/product-category/accessories/']")).click();
	driver.findElement(By.xpath("//a[text()='iMacs']")).click();
	Thread.sleep(3000);
	String actual = driver.getTitle();
	System.out.println("accessoriestitle : "+actual);
	String expected = "iMacs | ONLINE STORE";
	
	Assert.assertEquals(actual, expected);
	
}
@Test
public void ipads() throws InterruptedException
{
	//driver.findElement(By.xpath("//a[@herf = 'http://store.demoqa.com/products-page/product-category/accessories/']")).click();
	driver.findElement(By.xpath("//a[text()='iPads']")).click();
	Thread.sleep(3000);
	String actual = driver.getTitle();
	System.out.println("accessoriestitle : "+actual);
	String expected = "iPads | ONLINE STORE";
	
	Assert.assertEquals(actual, expected);
	
}
@Test
public void iPhones() throws InterruptedException
{
	//driver.findElement(By.xpath("//a[@herf = 'http://store.demoqa.com/products-page/product-category/accessories/']")).click();
	driver.findElement(By.xpath("//a[text()='iPhones']")).click();
	Thread.sleep(3000);
	String actual = driver.getTitle();
	System.out.println("accessoriestitle : "+actual);
	String expected = "iPhones | ONLINE STORE";
	
	Assert.assertEquals(actual, expected);
	
}
@Test
public void iPods() throws InterruptedException
{
	//driver.findElement(By.xpath("//a[@herf = 'http://store.demoqa.com/products-page/product-category/accessories/']")).click();
	driver.findElement(By.xpath("//a[text()='MacBooks']")).click();
	Thread.sleep(3000);
	String actual = driver.getTitle();
	System.out.println("accessoriestitle : "+actual);
	String expected = "MacBooks | ONLINE STORE";
	
	Assert.assertEquals(actual, expected);
	
}*/





  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.xpath("//*[@id=\"menu-item-15\"]/a")).click();
  }

}
