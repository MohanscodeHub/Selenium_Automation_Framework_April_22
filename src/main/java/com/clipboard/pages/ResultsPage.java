package com.clipboard.pages;

import com.clipboard.pages.pagecomponents.SortByComponent;
import org.openqa.selenium.By;

import java.util.List;
import lombok.SneakyThrows;

import static com.clipboard.utils.Genericutils.*;
import static com.clipboard.utils.PageActions.*;

public final class ResultsPage {

    private final SortByComponent sortByComponent;
    private static final By mainPriceList = By.xpath("//span[@class='a-price-whole']");
    private static final String labelPrice ="//span[text()='%s']";
    public ResultsPage() {

        this.sortByComponent = new SortByComponent();
    }

    public ResultsPage sortByPriceHighToLow(){

        sortByComponent.sortResultsWithPriceHighToLow();
        return this;
    }
    @SneakyThrows
    public ResultsPage openTheSecondHighestItem() {
        Thread.sleep(5000);
        waitForElementsToBeVisible(mainPriceList);
        List<String> price = getListOfItemsAsString(mainPriceList);
        String xpath =String.format(labelPrice,price.get(1));
        openLinkInNewWindow(By.xpath(xpath));
        return this ;
    }


    public ProductDetailsPage switchToProductDetailsPage(){
        switchToNewlyOpenedWindow();
        return new ProductDetailsPage() ;
    }



}
