package com.clipboard.pages.pagecomponents;


import com.clipboard.pages.BasePage;
import com.clipboard.utils.PageActions;
import org.openqa.selenium.By;

public class LeftmenuComponent extends BasePage {

    private static final By button_ham_menu = By.xpath("//a[@id='nav-hamburger-menu']");
    private static final By itemTv_app_electronics = By.xpath("//div[text()='TV, Appliances, Electronics']");
    private static final By itemTv_televisions = By.xpath("//a[text()='Televisions']");

    private LeftmenuComponent clickHamburgerMenu(){

        PageActions.waitAndClick(button_ham_menu);
        return this;
    }
    private LeftmenuComponent setLinkMainMenu(){

       PageActions.waitAndClick(itemTv_app_electronics);
        return this;
    }

    private LeftmenuComponent scrolldownTvAppliancesElectronics() {
        PageActions.scrollintoView();
        return this;
    }

    private LeftmenuComponent clickLinkMainMenu() {
        PageActions.waitAndClick(itemTv_televisions);
        return this;
    }

    public LeftmenuComponent navigation() {
               clickHamburgerMenu()
               .scrolldownTvAppliancesElectronics()
                .setLinkMainMenu()
                .clickLinkMainMenu();

        return this;
    }

}
