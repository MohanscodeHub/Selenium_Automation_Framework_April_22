package com.clipboard.pages;

import com.clipboard.pages.pagecomponents.LeftmenuComponent;
import com.clipboard.utils.PageActions;
import org.openqa.selenium.By;

public final class TelevisonsPage {

    private static LeftmenuComponent leftmenuComponent;
    private final By checkbox_brands = By.xpath("//span[text()='Samsung']");


    public TelevisonsPage() {

        this.leftmenuComponent = new LeftmenuComponent();

    }


    public TelevisonsPage navigatetoTelevisionsPage() {

        leftmenuComponent.navigation();
        return this;
    }

    private TelevisonsPage scrollintoBrands() {

        PageActions.scrollintoView();
        return this;
    }

    public ResutlsPage filterbyBrandname() {
        scrollintoBrands();
        PageActions.waitAndClick(checkbox_brands);

        return new ResutlsPage();
    }


}


