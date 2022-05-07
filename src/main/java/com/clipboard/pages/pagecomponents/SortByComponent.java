package com.clipboard.pages.pagecomponents;


import org.openqa.selenium.By;


import static com.clipboard.utils.PageActions.waitAndClick;

public final class SortByComponent {

    private static final By sort_dropdown = By.xpath("//span[text()='Sort by:']");
    private static final By hightolowoption = By.xpath("//a[text()='Price: High to Low']");


    private SortByComponent clickSort() {
        waitAndClick(sort_dropdown);
        return this;
    }

    private SortByComponent selectSortingOption() {

        waitAndClick(hightolowoption);
        return this;
    }

    public void sortResultsWithPriceHighToLow() {
        clickSort().selectSortingOption();
    }

}
