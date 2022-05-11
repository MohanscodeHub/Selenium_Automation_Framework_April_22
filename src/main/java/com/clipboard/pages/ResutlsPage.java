package com.clipboard.pages;

import com.clipboard.pages.pagecomponents.SortByComponent;
import org.openqa.selenium.By;

import static com.clipboard.utils.PageActions.*;

public final class ResutlsPage {

    private static SortByComponent sortByComponent;
    private static final String tvLink = "(//span[@class='a-price-whole'])[%s]//parent::*//parent::*//parent::a";
    public ResutlsPage() {

        this.sortByComponent = new SortByComponent();
    }

    public ResutlsPage sortByPriceHighToLow(){

        sortByComponent.sortResultsWithPriceHighToLow();
        return this;
    }

    public ResutlsPage openTheItemByIndex(int item) {
        String xpath =String.format(tvLink,item);
        openLinkInNewWindow(By.xpath(xpath));
        return this ;
    }


    public ProductDetailsPage switchToProductDetailsPage(){
        switchToNewlyOpenedWindow();
        return new ProductDetailsPage() ;
    }



}
