package com.example.definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.actions.CheckOutPageActions;
import com.example.actions.HomePageActions;
import com.example.utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutPageDefinition {
	
	private final HomePageActions homepageActions;
	private final CheckOutPageActions checkOutPageActions;
	private final WebDriver driver;
	
	
	public CheckOutPageDefinition(DriverFactory driverFactory) {
		this.homepageActions = new HomePageActions(driverFactory);
		this.checkOutPageActions = new CheckOutPageActions(driverFactory);
		this.driver = driverFactory.getDriver();		
	}
	

	@When("User clicks Checkout Menu")
	 public void user_clicks_checkout_menu() {
		homepageActions.clickCartMenu();
	    driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
	 }
	
	@Then("Verify Invoice address")
	 public void verifyUserAddress() {
		String invoiceAddress = checkOutPageActions.getBillingAddressText();    
	 }
}
