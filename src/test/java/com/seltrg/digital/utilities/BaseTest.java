package com.seltrg.digital.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public static WebDriver createDriver(){
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Hp\\hyfw\\modularfw\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.amazon.in");
			System.out.println("Driver Created");
			return driver;
		} else {
			return driver;
		}
	}
	

	public WebDriver getDriver() {
		driver = createDriver();
		return driver;
	}
	
	@AfterSuite
	public void teardown() {
		getDriver().quit();
	}

}
