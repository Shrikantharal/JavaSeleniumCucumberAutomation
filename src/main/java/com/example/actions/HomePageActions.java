package com.example.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.example.locators.HomePageElements;
import com.example.utils.DriverFactory;

public class HomePageActions {
	
	static WebDriver driver;
	HomePageElements elements = null;

	public HomePageActions(DriverFactory driverFactory) {
		this.driver = driverFactory.getDriver();
		this.elements = new HomePageElements();

		PageFactory.initElements(driver, elements);
	}

	public void clickProductMenu() {
		if (elements.productMenu != null) {
			elements.productMenu.click();
		}
	}

	public void clickCartMenu() {
		if (elements.cartMenu != null) {
			elements.cartMenu.click();
		}
	}

	public void clickTestCaseMenu() {
		if (elements.testCaseMenu != null) {
			elements.testCaseMenu.click();
		}
	}

	public void clickApiTestMenu() {
		if (elements.apiTestingMenu != null) {
			elements.apiTestingMenu.click();
		}
	}

	public void clickVideoTutoMenu() {
		if (elements.videoTutoMenu != null) {
			elements.videoTutoMenu.click();
			// Navigate back
			driver.navigate().back();
		}
	}

	public void clickUserProfileMenu() {
		if (elements.userProfileMenu != null) {
			elements.userProfileMenu.click();
		}
	}

}
