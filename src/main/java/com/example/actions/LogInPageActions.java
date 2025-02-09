package com.example.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.example.locators.LogInPageElements;
import com.example.utils.DriverFactory;

public class LogInPageActions {

	LogInPageElements elements = null; 
	static WebDriver driver;
	
    public LogInPageActions(DriverFactory driverFactory) 
    {
    	this.driver = driverFactory.getDriver();
        this.elements = new LogInPageElements();
 
        PageFactory.initElements(driver, elements);
    }
    
    public String getTitle()
    {
    	return driver.getTitle();
    }
}
