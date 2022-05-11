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

    public int selectSecondHighestitem(int index){


        List< WebElement> items =DriverManager.getDriver().findElements(By.xpath("//span[@class='a-price-whole']"));
        List<Integer> priceList = new ArrayList<>();
        for(WebElement el:items){
            priceList.add(Integer.parseInt(el.getText()));
        }
        Collections.sort(priceList);
        return priceList.get(index);
    }

    public static List<String> getListOfItems(By by) {
        List< WebElement> items =DriverManager.getDriver().findElements(by);
        List<String> values = new ArrayList<>();
        for(WebElement el:items){
            values.add(el.getText());
        }
        return values;

    }

}
