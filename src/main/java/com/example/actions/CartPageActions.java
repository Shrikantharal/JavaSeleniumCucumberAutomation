package com.example.actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.example.locators.CartPageElements;
import com.example.utils.DriverFactory;

public class CartPageActions {
	static WebDriver driver;
	CartPageElements elements = null;

	public CartPageActions(DriverFactory driverFactory) {
		this.driver = driverFactory.getDriver();
		this.elements = new CartPageElements();

		PageFactory.initElements(driver, elements);
	}

	public List<String> getAllItemsInCart() {
		List<String> itemList = new ArrayList<>();
		List<WebElement> cartItems = elements.CartItemDetailsElement; // Retrieve the cart item elements

		for (WebElement item : cartItems) {
			String itemText = item.getText()
					.trim()
					.replace(" ", "")
					.toLowerCase();
			itemList.add(itemText); // Add normalized text to the list
		}
		return itemList;
	}
}
