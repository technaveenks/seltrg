package com.seltrg.digital.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{
	
	@FindBy(xpath="//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a/span")
	private WebElement _searchResults;
	
	@FindBy(xpath="//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	private WebElement _searchResultsXbox;
	
	public AddToCartPage clickOnSearchItem(){
		_searchResults.click();
		return new AddToCartPage(getDriver());
	}
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

}
