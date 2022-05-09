package com.clipboard.tests;

import com.clipboard.pages.TelevisonsPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class AddToCartPageTests extends BaseTest {

    @Test
    public void verifyProductHeaderTest() {

        String about= new TelevisonsPage()
                .navigatetoTelevisionsPage()
                .filterbyBrandname()
                .sortByPriceHighToLow()
                .openTheItemByIndex(2)
                .switchtoAddToCartPage()
                .getAboutthisitem();

        Assertions.assertThat(about)
                .isEqualTo( "About this item");



    }
    @Test
    public void logProductDescriptionTest() {

        new TelevisonsPage()
                .navigatetoTelevisionsPage()
                .filterbyBrandname()
                .sortByPriceHighToLow()
                .openTheItemByIndex(2)
                .switchtoAddToCartPage()
                        .printDescription();




    }
}
