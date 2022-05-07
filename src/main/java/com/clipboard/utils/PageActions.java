
package com.clipboard.utils;


import com.clipboard.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public final class PageActions {

    private PageActions() {

    }

    public static void waitAndClick(By by){
        waitForElementToBePresent(by).click();

    }


    public static String getTitle(){
        return DriverManager.getDriver().getTitle();

    }

    public static WebElement waitForElementToBePresent(By by){
        return new WebDriverWait(DriverManager.getDriver(),10)
                .until(ExpectedConditions.presenceOfElementLocated(by));

    }


    public static void scrollintoView() {

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,50)", "");
    }

    public static String getText(By by){
        return waitForElementToBePresent(by).getText();
    }
}