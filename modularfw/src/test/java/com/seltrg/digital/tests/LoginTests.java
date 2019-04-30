package com.seltrg.digital.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests {
	WebDriver driver;

	@Test
  public void test_verify_login_page() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Java_Programs\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		     driver.navigate().to("https://www.amazon.in/");  
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera"+ Keys.ENTER);
	 driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a")).click();
	   Set<String>windows=driver.getWindowHandles();
	   Iterator<String>itr = windows.iterator();
	   String fwin= itr.next();
	   String swin= itr.next();
	   driver.switchTo().window(swin);
	  // Thread.sleep(3000);
	   //driver.findElement(By.id("//*[@id='add-to-cart-button']")).click();
	   driver.findElement(By.xpath("//*[@id='submit.add-to-cart']/span")).click(); 
	   driver.quit();
  }
 /* @Test(priority=2)
  public void test_verify_login_page_now()  {
	  driver.findElement(By.id("twotabsearchtextbox")).clear();
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Xbox"+ Keys.ENTER);
	 //   driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a")).click();
	   //driver.findElement(By.id("//*[@id='add-to-cart-button']")).click();
	     
	    
  }
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Java_Programs\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.navigate().to("https://www.amazon.in/");  
  }
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }*/
}
