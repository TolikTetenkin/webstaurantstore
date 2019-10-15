package com.WebStore.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WebStore.pages.CartPage;
import com.WebStore.pages.HomePage;
import com.WebStore.pages.SelectedItemPage;
import com.WebStore.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderSteps extends CommonMethods {

	public HomePage hp;
	public SelectedItemPage selectedItemPage;
	public CartPage cartPage;

	@Given("User on a home page")
	public void user_on_a_home_page() {

		hp = new HomePage();

		Assert.assertTrue(hp.getBannerLogo().isDisplayed());

	}

	@When("User typed {string} in to search box and tap search")
	public void user_typed_in_to_search_box_and_tap_search(String itemId) {

		sendText(hp.getSearchBox(), itemId);

		click(hp.getSearchButton());

	}

	@When("Verify that User landed on a page with {string} item")
	public void verify_that_User_landed_on_a_page_with_item(String itemTitle) {

		selectedItemPage = new SelectedItemPage();

		waitForElementBeVisible(selectedItemPage.getItemTitle(), 5);

		Assert.assertEquals(itemTitle, selectedItemPage.getItemTitle().getText());

	}

	@Then("User tap on Add to Card button")
	public void user_tap_on_Add_to_Card_button() {

		click(selectedItemPage.getAddToCardButton());

	}

	@Then("User tap on Cart button")
	public void user_tap_on_Cart_button() {

		click(selectedItemPage.getCart());

	}

	@Then("Verify that {string} item in a card")
	public void verify_that_item_in_a_card(String itemTitle) {

		cartPage = new CartPage();

		waitForElementBeVisible(cartPage.getItemTitle(), 5);

		Assert.assertEquals(itemTitle, cartPage.getItemTitle().getText());

	}

	@Then("User tap on Empty Card button")
	public void user_tap_on_Empty_Card_button() {

		click(cartPage.getEmptyCartButton());

	}

	@Then("Verify that conformation appears")
	public void verify_that_conformation_appears() {

		waitForElementBeVisible(cartPage.getEmptyCartPopUpWindowButton(), 5);

		Assert.assertTrue(cartPage.getEmptyCartPopUpWindowButton().isDisplayed());

	}

	@Then("User tap on Empty Cart button in the conformation")
	public void user_tap_on_Empty_Cart_button_in_the_conformation() {

		click(cartPage.getEmptyCartPopUpWindowButton());

	}

}
