package com.clipboard.utils;

import com.clipboard.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Genericutils {

    private Genericutils() {

    }


    public static List<String> getListOfItemsAsString(By by) {
        List<WebElement> items = DriverManager.getDriver().findElements(by);
        List<String> values = new ArrayList<>();
        for (WebElement el : items) {
            values.add(el.getText());
        }
        return values;

    }


    public static List<Integer> sortListOfItemsInDescendingOrder(List<String> values ) {
        List<Integer> items = new ArrayList<>();
        for (String el : values) {
          items.add(Integer.valueOf(el.replace(",","")));

        }
        Collections.sort(items, Collections.reverseOrder());
        return items;

    }

}
