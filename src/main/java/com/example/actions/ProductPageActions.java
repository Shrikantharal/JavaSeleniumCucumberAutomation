package com.example.actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.example.locators.ProductPageElements;
import com.example.utils.DriverFactory;

public class ProductPageActions {
	
	static WebDriver driver;
	ProductPageElements elements = null;

	public ProductPageActions(DriverFactory driverFactory) {
		this.driver = driverFactory.getDriver();
		this.elements = new ProductPageElements();

		PageFactory.initElements(driver, elements);
	}

	public void addItemsToCart(List<String> expectItems) {			
		List<WebElement> items = elements.Item;

		// Add expected items to cart
		for (String expectedItem : expectItems) {
			for (WebElement item : items) {
				String itemText = item.findElement(By.xpath(".//div[@class='productinfo text-center']//p")).getText().trim().replace(" ", "").toLowerCase();

				if (itemText.equals(expectedItem.trim().replace(" ", "").toLowerCase())) {
					
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					 js.executeScript("arguments[0].scrollIntoView(true);",
							 item.findElement(By.xpath(".//div[@class='productinfo text-center']")));
					 
					 item.findElement(By.xpath(".//div[@class='productinfo text-center']"
					 		+ "//a[@class='btn btn-default add-to-cart']")).click();	
					 
					 elements.ContinueShoppingButton.click(); // Assuming this element is defined in MenuElements
				}
			}
		}
	}
}
