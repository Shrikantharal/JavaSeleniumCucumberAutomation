package com.example.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElements {

	@FindBy(xpath = "//*[@class='cart_description']/h4")
	public List<WebElement> CartItemDetailsElement;

	@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
	public WebElement ProceedToCheckout;
}
