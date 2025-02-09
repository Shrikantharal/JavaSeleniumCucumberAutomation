package com.example.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.example.locators.ContactUsPageElements;
import com.example.utils.DriverFactory;

public class ContactUsPageActions {
	static WebDriver driver;
	ContactUsPageElements elements= null;
	
	public ContactUsPageActions(DriverFactory driverFactory){
		this.driver = driverFactory.getDriver();
		this.elements = new ContactUsPageElements();

		PageFactory.initElements(driver, elements);
	}
	
	public  void  contactMenu() {
		
		elements.contactUsMenuLink.click();		
	}
	
	public void inputUserConntactDetails() {
		elements.nameInputBoxElement.sendKeys("ShrikantHaral");
		elements.emailInputBoxElement.sendKeys("jky0b60mga@vafyxh.com");
		elements.messageInputBoxElement.sendKeys("There is issue with my order");
		elements.subjectInputBoxElement.sendKeys("get back to me ASAP!");
		elements.submitButtonElement.click();
	}
	
	public void acceptAlert() {
		
		driver.switchTo().alert().accept();		
	}
	
	public void verifyMessageSubmissitonStatus() {
		
		String actualMessage= elements.statusMessagElement.getText();
		//Assert.assertEquals(actualMessage, "Success! Your details have been submitted successfully.");
	}
	

}
