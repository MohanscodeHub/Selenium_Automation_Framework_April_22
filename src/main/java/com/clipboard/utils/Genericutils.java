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
            Long.parseLong(el.getText());
            priceList.add((int) Long.parseLong(el.getText()));
        }
        Collections.sort(priceList);
        return priceList.get(index);
    }
}
