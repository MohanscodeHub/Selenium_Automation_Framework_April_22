package com.clipboard.pages;

import org.openqa.selenium.By;

import java.util.List;

import static com.clipboard.utils.Genericutils.*;
import static com.clipboard.utils.PageActions.*;

public final class ProductDetailsPage {

    private static final By productDescriptionHeader = By.xpath("//h1[text()=' About this item ']");
    private static final By productFeaturesList = By.xpath("//h1[@class='a-size-base-plus a-text-bold']//following-sibling::ul/li");

    public String getAboutThisItem(){

        return getTextByElement(productDescriptionHeader);
    }

    public List<String> getProductDetails(){

       return getListOfItemsAsString(productFeaturesList);

    }

}
