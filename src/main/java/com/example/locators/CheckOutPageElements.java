package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPageElements {
	
	@FindBy(xpath = "//ul[@id='address_invoice']")
	public WebElement invoiceAddressElement;
}
