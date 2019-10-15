package com.WebStore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebStore.utils.BaseClass;

public class SelectedItemPage extends BaseClass {

	public SelectedItemPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='breadcrumb ']//li[5]")
	private WebElement itemTitle;
	
	@FindBy(id="buyButton")
	private WebElement addToCardButton;
	
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	private WebElement cart;
	
	public WebElement getCart() {
		return cart;
	}

	public WebElement getItemTitle() {
		return itemTitle;
	}

	public WebElement getAddToCardButton() {
		return addToCardButton;
	}
	
	

}
