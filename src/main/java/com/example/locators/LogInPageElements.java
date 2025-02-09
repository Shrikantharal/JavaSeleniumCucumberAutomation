package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPageElements {
	
	    @FindBy(name = "email")
	    public WebElement userEmail;
	  
	    @FindBy(name = "password")
	    public WebElement userPassword;
	     
	    @FindBy(xpath = "//button[@type='submit']")
	    public WebElement submitButton;
}