package com.example.definitions;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import com.example.actions.LogInPageActions;
import com.example.utils.DriverFactory;
import com.example.utils.LoginUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogInDefinition {

	private final LogInPageActions logInAction;

	public LogInDefinition(DriverFactory driverFactory) { // PicoContainer Injects DriverFactory
		this.logInAction = new LogInPageActions(driverFactory);
		new LoginUtils(driverFactory);
	}

	@Given("User Logged in to AutomationExercise Application")
	public void logIn() throws IOException {
		LoginUtils.LoginIfNotLoggedIn();
	}

	@Then("Verify title after login is {string}")
	public void verifyTitle(String userName) {
		assertEquals(userName, logInAction.getTitle());
	}
}