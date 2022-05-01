package com.clipboard.tests;

import com.clipboard.driver.DriverManager;
import com.clipboard.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class HomePageTests extends BaseTest{

    private HomePageTests(){


    }


    @Test
    public void hamburgertest() {

      HomePage hm = new HomePage();
      hm.click_HamburgerMenu();

    }
}
