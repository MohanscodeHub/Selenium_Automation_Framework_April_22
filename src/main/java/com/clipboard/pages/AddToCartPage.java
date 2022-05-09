package com.clipboard.pages;

import org.openqa.selenium.By;

import static com.clipboard.utils.Genericutils.getListOfItems;
import static com.clipboard.utils.PageActions.*;

public final class AddToCartPage {

    private static final By productdescriptionheader = By.xpath("//h1[text()=' About this item ']");
    private static final By productdescriptionlist = By.xpath("//h1[@class='a-size-base-plus a-text-bold']//following-sibling::ul/li");

    public String getAboutthisitem(){

        return getText(productdescriptionheader);
    }

    public void printDescription(){

        getListOfItems(productdescriptionlist);

    }

}
