package com.clipboard.pages.pagecomponents;


import com.clipboard.utils.DynamicXpathUtils;
import com.clipboard.utils.PageActions;
import org.openqa.selenium.By;

public class LeftmenuComponent {

    private static final By buttonHamMenu = By.xpath("//a[@id='nav-hamburger-menu']");
    String itemTvAppElectronics = "//div[text()='%s']";
    String itemTelevisions = "//a[text()='%s']";

    private LeftmenuComponent clickHamburgerMenu() {


        PageActions.waitAndClick(buttonHamMenu);
        return this;
    }

    private LeftmenuComponent setLinkMainMenu() {
        String xpath = DynamicXpathUtils.getModifiedXpath(itemTvAppElectronics, "TV, Appliances, Electronics");
        PageActions.waitAndClick(By.xpath(xpath));
        return this;
    }

    private LeftmenuComponent scrolldownTvAppliancesElectronics() {
        PageActions.scrollintoView();
        return this;
    }

    private LeftmenuComponent clickLinkMainMenu() {
        String xpath = DynamicXpathUtils.getModifiedXpath(itemTelevisions, "Televisions");
        PageActions.waitAndClick(By.xpath(xpath));
        return this;
    }

    public LeftmenuComponent navigation() {
        clickHamburgerMenu().scrolldownTvAppliancesElectronics().setLinkMainMenu().clickLinkMainMenu();

        return this;
    }

}
