package com.example.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElements {

	@FindBy(xpath = "//li[@id='PageContent__navigatorBar_ctl09__userMenu']")
    public WebElement AccountMenu;
  
    @FindBy(xpath = ".//div[@class='single-products']")
    public List<WebElement> Item;
     
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    public WebElement ContinueShoppingButton;
}
