package com.WebStore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebStore.utils.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="banner-logo")
	private WebElement bannerLogo;
	
	@FindBy(id="searchval")
	private WebElement searchBox;
	
	@FindBy(css="input[type='submit']")
	private WebElement searchButton;
	
	@FindBy(linkText="Cart")
	private WebElement cart;

	public WebElement getBannerLogo() {
		return bannerLogo;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getCart() {
		return cart;
	}	

}
