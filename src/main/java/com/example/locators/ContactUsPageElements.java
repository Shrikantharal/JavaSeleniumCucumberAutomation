package com.example.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPageElements {
	
	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	public WebElement contactUsMenuLink;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	public WebElement nameInputBoxElement;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement emailInputBoxElement;
	
	@FindBy(xpath = "//input[@placeholder='Subject']")
	public WebElement subjectInputBoxElement;
	
	@FindBy(xpath = "//textarea[@id='message']")
	public WebElement messageInputBoxElement;
	
	@FindBy(xpath = "//input[@name='submit']")
	public WebElement submitButtonElement;
	
	@FindBy(xpath = "//div[@class='status alert alert-success']")
	public WebElement statusMessagElement;
}
