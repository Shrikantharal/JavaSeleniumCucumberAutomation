package com.example.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.example.locators.CheckOutPageElements;
import com.example.utils.DriverFactory;

public class CheckOutPageActions {
	
	static WebDriver driver;
	CheckOutPageElements elements =null;
	
	public CheckOutPageActions(DriverFactory driverFactory) {
		this.driver = driverFactory.getDriver();
		this.elements = new CheckOutPageElements();
		
		PageFactory.initElements(driver, elements);
	}
	
	public String getBillingAddressText() {
		return elements.invoiceAddressElement.getText();
	}

}
