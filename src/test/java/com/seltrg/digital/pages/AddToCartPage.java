package com.seltrg.digital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage{
	
	
	@FindBy(id="a-autoid-0-announce")
	private WebElement _btnAddToCart;
	
	public void clickOnAddToCart(){
		_btnAddToCart.click();
	}
	
	public AddToCartPage(WebDriver driver) {
		super(driver);
	}

}
