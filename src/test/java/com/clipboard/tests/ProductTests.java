package com.clipboard.tests;

import com.clipboard.pages.TelevisonsPage;
import org.testng.annotations.Test;

public class ProductTests extends BaseTest {

    @Test
    public void navtest(){

      new TelevisonsPage().navigatetoTelevisionsPage();
    }
}
