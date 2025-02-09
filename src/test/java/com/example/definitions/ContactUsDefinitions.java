package com.example.definitions;

import com.example.actions.ContactUsPageActions;
import com.example.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsDefinitions {
	private final ContactUsPageActions contactUsPageActions;
	
	public ContactUsDefinitions(DriverFactory driverFactory) {
		this.contactUsPageActions = new ContactUsPageActions(driverFactory);
	}
	
	@Given("User clicks on ContactUs Menu")
	public void user_clicks_on_contact_us_menu() {
	    
		contactUsPageActions.contactMenu();
	}

	@When("User inputs all own contact details")
	public void user_inputs_all_own_contact_details() {
	    
		contactUsPageActions.inputUserConntactDetails();
	}

	@Then("Alert popup should display to accept")
	public void alert_popup_should_display_to_accept() {
	    
		contactUsPageActions.acceptAlert();
	}

	@Then("Verify message for successfull submission")
	public void verify_message_for_successfull_submission() {
		contactUsPageActions.verifyMessageSubmissitonStatus();
	}

}
