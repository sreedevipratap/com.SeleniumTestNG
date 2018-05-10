/*package TestNGDemo;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class DataDrivenDemo {
	public static WebDriver driver;
	public static Workbook wb;
	public static Sheet sh;
  @Test(priority=2)
  public void Login() {
	  
	  int rowsize = sh.getRows();
	  int columnsize = sh.getColumns();
	for(int i=1;i<rowsize;i++)
	//{for(int j=0;j<columnsize;j++)
	{
	  String userName = sh.getCell(0,i).getContents();
	  String passWord = sh.getCell(1,i).getContents();
	  driver.findElement(By.name("userName")).sendKeys(userName);
	  driver.findElement(By.name("password")).sendKeys(passWord);
	  driver.findElement(By.name("login")).click();
	}//}
  }
/* @Test(priority=0)
 public void Login1() {
	  
	  String userName = sh.getCell(0,2).getContents();
	  String passWord = sh.getCell(1,2).getContents();
	  driver.findElement(By.name("userName")).sendKeys(userName);
	  driver.findElement(By.name("password")).sendKeys(passWord);
	  driver.findElement(By.name("login")).click();
  }
 @Test(priority=1)
 public void Login2() {
	  
	  String userName = sh.getCell(0,3).getContents();
	  String passWord = sh.getCell(1,3).getContents();
	  driver.findElement(By.name("userName")).sendKeys(userName);
	  driver.findElement(By.name("password")).sendKeys(passWord);
	  driver.findElement(By.name("login")).click();
 }*/ /*
  @BeforeMethod
  public void beforeMethod() {
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  
	 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText("Home")).click();
  }

  @BeforeClass
  public void beforeClass() throws BiffException, IOException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sreed\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	  driver.get("http://newtours.demoaut.com/");
	  
	  File xls = new File("D:\\SP\\sree\\DataDrivenDemo.xls");
	  
	  wb=Workbook.getWorkbook(xls);
	  //obj of workbook created as below or above also
	 // wb=Workbook.getWorkbook(new File("D:\sree\DataDrivenDemo.xls"));
	  
	  sh=wb.getSheet(0);
	  //sh=wb.getSheet("userpwd");
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}*/
