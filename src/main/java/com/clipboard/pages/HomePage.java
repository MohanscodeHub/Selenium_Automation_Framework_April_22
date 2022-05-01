package com.clipboard.pages;

import com.clipboard.driver.DriverManager;
import org.openqa.selenium.By;

public final class HomePage {

   public  HomePage(){
}

private final By hamburger_menu = By.xpath("//i[@class='hm-icon nav-sprite']");


public void click_HamburgerMenu(){

    DriverManager.getDriver().findElement(hamburger_menu).click();
}
}

