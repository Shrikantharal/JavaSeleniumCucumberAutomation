package com.example.utils;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private WebDriver driver;
	public final static int TIMEOUT = 10;

	public void initializeDriver() {
		if (driver == null) {
			File extensionFile = new File(FileUtility.getFilePath("/src/main/resources/uBlockOrigin.crx"));
			ChromeOptions options = new ChromeOptions();
			options.addExtensions(extensionFile);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().window().maximize();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
