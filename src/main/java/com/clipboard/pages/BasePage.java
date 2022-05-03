package com.clipboard.pages;

import com.clipboard.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage {

    protected void click(By by) {

        DriverManager.getDriver().findElement(by).click();

    }

    protected String getPagetitle() {

       return  DriverManager.getDriver().getTitle();

    }

    protected void scrollintoView() {

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,250)", "");

    }

}
