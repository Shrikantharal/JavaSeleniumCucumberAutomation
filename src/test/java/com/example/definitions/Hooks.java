package com.example.definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.example.utils.DriverFactory;
import com.example.utils.GeneralUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private final DriverFactory driverFactory;

	public Hooks(DriverFactory driverFactory) {
		this.driverFactory = driverFactory;
	}

	@Before
	public void setUp() {
		GeneralUtility.cleanReports();
		driverFactory.initializeDriver();
	}

	@After
	public void tearDown(Scenario scenario) {

		// validate if scenario has failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		driverFactory.quitDriver();
	}
}