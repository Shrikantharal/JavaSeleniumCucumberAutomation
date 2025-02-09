package com.example.utils;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUtils {
	public static Properties prp;
	static WebDriver driver;
	 public LoginUtils(DriverFactory driverFactory) {
		 this.driver = driverFactory.getDriver();
	}

	public static void LoginIfNotLoggedIn() throws IOException
	 {		 
		 prp = PropertyLoader.loadProperty("/src/main/resources/config.properties");
		 
		 String url = prp.getProperty("url");
		 String username = prp.getProperty("email");
		 String password = prp.getProperty("password");
		 
	     if (IsLoggedIn(url))
	     {
	         return;
	     }

	     if (!driver.getCurrentUrl().contains(url))
	     {
	    	 driver.get(url);
	     }
	     
	     driver.findElement(By.xpath("//input[@data-qa='login-email']")).clear();
	     driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(username);
	     driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
	     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	 }
	 
	 public static Boolean IsLoggedIn(String url) {
		 	driver.get(url);
		    //HelperClass.openPage(url);
		    List<WebElement> list = driver.findElements(By.xpath(".//ul[contains(@class,'nav navbar-nav')]//li//a"));
		    
		    for (WebElement item : list) {
		        if (item.getText().equals("Logout")) {
		            return true;
		        }
		    }
		    return false;
		}
}
