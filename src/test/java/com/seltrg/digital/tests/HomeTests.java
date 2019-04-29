package com.seltrg.digital.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seltrg.digital.pages.AddToCartPage;
import com.seltrg.digital.pages.HomePage;
import com.seltrg.digital.pages.SearchResultsPage;
import com.seltrg.digital.utilities.BaseTest;

public class HomeTests extends BaseTest{
	WebDriver driver;
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	AddToCartPage addToCartPage;

	@Test(priority = 1)
	public void test_verify_login_page() {
		searchResultsPage = homePage.setSearchValue("Camera" + Keys.ENTER);
		searchResultsPage.clickOnSearchItem();
		//System.out.println("Test 1 ");
		
	}

	@Test(priority = 2, enabled=true)
	public void test_verify_login_page_now() {
		
		searchResultsPage = homePage.setSearchValue("Camera" + Keys.ENTER);
		addToCartPage = searchResultsPage.clickOnSearchItem();
		addToCartPage.clickOnAddToCart();
		//System.out.println("Test 2");
	}
	
	@BeforeMethod
	public void beforeTest(){
		System.out.println("Before Test");
	}

	@BeforeClass
	public void setup() {
		
		homePage = new HomePage(getDriver()); 
	}


}

	