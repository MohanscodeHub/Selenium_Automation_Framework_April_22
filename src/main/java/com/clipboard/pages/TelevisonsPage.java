package com.clipboard.pages;

import com.clipboard.pages.pagecomponents.LeftmenuComponent;
import com.clipboard.utils.PageActions;
import org.openqa.selenium.By;

public final class TelevisonsPage {

    private final LeftmenuComponent leftmenuComponent;
    private final By checkboxBrands = By.xpath("//span[text()='Samsung']");


    public TelevisonsPage() {

        this.leftmenuComponent = new LeftmenuComponent();

    }


    public TelevisonsPage navigatetoTelevisionsPage() {

        leftmenuComponent.navigation();
        return this;
    }

    private TelevisonsPage scrollintoBrands() {

        PageActions.scrollIntoView();
        return this;
    }

    public ResultsPage filterByBrandName() {
        scrollintoBrands();
        PageActions.waitAndClick(checkboxBrands);

        return new ResultsPage();
    }


}


