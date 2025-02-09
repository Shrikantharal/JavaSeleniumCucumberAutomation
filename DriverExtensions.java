package com.example.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DriverExtensions {

    public static WebElement findByXpath(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public static WebElement findById(WebDriver driver, String id) {
        return driver.findElement(By.id(id));
    }

    public static WebElement findByName(WebDriver driver, String name) {
        return driver.findElement(By.name(name));
    }

    public static void clickByJS(WebDriver driver, WebElement element) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    public static void sendKeysByJS(WebDriver driver, WebElement element, String text) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", element, text);
        }
    }

    public static String saveScreenshot(TakesScreenshot screenshotDriver, String imageTitle, String fileNameTitle) {
        String fileName = "";
        try {
            String timeStamp = new SimpleDateFormat("dd_MM_yyyy").format(new Date());
            if (!fileName.isEmpty()) {
                fileNameTitle = "_" + fileNameTitle + "_";
            } else {
                fileNameTitle = "_";
            }
            fileName = String.format("%s/%s%s%s.png",
                    System.getProperty("user.dir"), 
                    fileNameTitle, 
                    timeStamp, 
                    screenshotDriver.getScreenshotAs(OutputType.FILE).getAbsolutePath());

            File screenshot = screenshotDriver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();  // Log the error or handle it as needed
        }
        return fileName;
    }

    public static void click(WebDriver driver, WebElement element, int maxRetries) {
        for (int attempt = 0; attempt < maxRetries; attempt++) {
            try {
                if (element.isDisplayed() && element.isEnabled()) {
                    element.click();
                    return;
                }
            } catch (org.openqa.selenium.NoSuchElementException | 
                     org.openqa.selenium.ElementNotInteractableException e) {
                // Element not found or not interactable; continue to next attempt
            }
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
        throw new RuntimeException("Element was not clickable after " + maxRetries + " attempts.");
    }
}
