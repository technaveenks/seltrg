package com.seltrg.digital.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	/**
	 * Page Factory Elements
	 */
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement _txtSearchBox;
	
	
	
	
	/**
	 * Actions on Elements
	 * @param Value
	 * @return 
	 */
	public SearchResultsPage setSearchValue(String Value){
		_txtSearchBox.clear();
		_txtSearchBox.sendKeys(Value);
		return new SearchResultsPage(getDriver());
	}
	

	/**
	 * Constructor
	 * @param Value
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * utilities
	 */

}
