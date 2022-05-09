package com.clipboard.utils;


import com.clipboard.driver.DriverManager;
import com.clipboard.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;



public final class PageActions {

    private PageActions() {

    }

    public static void waitAndClick(By by) {
        waitForElementToBePresent(by).click();
        ExtentLogger.pass("the elment is clicked successfully");

    }


    public static String getTitle() {
        return DriverManager.getDriver().getTitle();

    }

    public static WebElement waitForElementToBePresent(By by) {
        return new WebDriverWait(DriverManager.getDriver(), 50).until(ExpectedConditions.presenceOfElementLocated(by));
       // TODO - get the wait from framework constants
    }


    public static void scrollintoView() {

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,50)", "");
    }

    public static String getText(By by) {
        return waitForElementToBePresent(by).getText();
    }

    public static void switchToNewlyOpenedWindow() {
        String parentWinHandle = DriverManager.getDriver().getWindowHandle();

        Set<String> winHandles = DriverManager.getDriver().getWindowHandles();
        for (String temp : winHandles) {
            if (!temp.equalsIgnoreCase(parentWinHandle)) {
                DriverManager.getDriver().switchTo().window(temp);

            }
        }
    }

    public static String getHref() {
        return DriverManager.getDriver().findElement(By.xpath("(//span[@class='a-price-whole'])[2]//parent::*//parent::*//parent::a")).getAttribute("href");

    }

    public static void openLinkInNewWindow(By by) {
        waitForElementToBePresent(by);
        Actions act = new Actions(DriverManager.getDriver());
        act.keyDown(Keys.SHIFT).click(DriverManager.getDriver().findElement(by)).keyUp(Keys.SHIFT).build().perform();


    }

    public static void selectValueInDropDown(By by,int index) {
        WebElement element = waitForElementToBePresent(by);
        Select select = new Select(element);
        select.selectByIndex(index);
    }


}


