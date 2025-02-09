package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

	@FindBy(xpath = "//a[@href='/products']")
	public WebElement productMenu;

	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement cartMenu;

	@FindBy(xpath = "//a[contains(text(),'Test Cases')]")
	public WebElement testCaseMenu;

	@FindBy(xpath = "//a[normalize-space()='API Testing']")
	public WebElement apiTestingMenu;

	@FindBy(xpath = "//a[normalize-space()='Video Tutorials']")
	public WebElement videoTutoMenu;

	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	public WebElement contactUsMenu;

	@FindBy(xpath = "//header[@id='header']//li[6]//a[1]")
	public WebElement userProfileMenu;
}
