package com.WebStore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebStore.utils.BaseClass;

public class CartPage extends BaseClass{
	
	public CartPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='cartItem ag-item gtm-product-auto']//span[@class='itemDescription description']")
	private WebElement itemTitle;
	
	@FindBy(css="a[class^=\"emptyCartButton\"]")
	private WebElement emptyCartButton;
	
	@FindBy(xpath="//div[@class='modal fade bs-native modal--sm modal--collapse show']//button[contains(text(),\"Empty Cart\")]")
	private WebElement emptyCartPopUpWindowButton;

	public WebElement getItemTitle() {
		return itemTitle;
	}

	public WebElement getEmptyCartButton() {
		return emptyCartButton;
	}

	public WebElement getEmptyCartPopUpWindowButton() {
		return emptyCartPopUpWindowButton;
	}
	
	
	

}
