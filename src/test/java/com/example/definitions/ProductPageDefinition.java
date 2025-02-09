package com.example.definitions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import com.example.actions.CartPageActions;
import com.example.actions.HomePageActions;
import com.example.actions.ProductPageActions;
import com.example.utils.DriverFactory;
import io.cucumber.java.en.When;

public class ProductPageDefinition {

	ProductPageActions productPageActions;
	HomePageActions homePageActions;
	CartPageActions cartPageActions;
	
	public ProductPageDefinition(DriverFactory driverFactory) {
		this.productPageActions = new ProductPageActions(driverFactory);
		this.homePageActions = new HomePageActions(driverFactory);
		this.cartPageActions = new CartPageActions(driverFactory);
	}

	@When("User clicks ProductMenu")
	public void userClickProduct() {

		homePageActions.clickProductMenu();
	}

	@When("Add Multiple Products To Cart")
	public void AddMultipleProductsToCart() {
		List<String> expectItems = Arrays.asList("Blue Top", "Men T shirt", "Sleeveless Dress", "Fancy Green Top");
		
		productPageActions.addItemsToCart(expectItems);
		homePageActions.clickCartMenu();
		List<String> actualItems = null;
		try {
			actualItems = cartPageActions.getAllItemsInCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String> normalizedExpectItems = expectItems.stream()
				.map(item -> item.trim().replace(" ", "").toLowerCase()).collect(Collectors.toList());

		Assert.assertTrue("Actual items do not match expected items", actualItems.containsAll(normalizedExpectItems));
		System.out.println("all steps are executed");
	}
}
