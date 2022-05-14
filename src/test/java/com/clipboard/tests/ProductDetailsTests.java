package com.clipboard.tests;

import com.clipboard.base.BaseTest;
import com.clipboard.pages.ProductDetailsPage;
import com.clipboard.pages.TelevisonsPage;
import com.clipboard.reports.ExtentLogger;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class ProductDetailsTests extends BaseTest {

    @Test
    public void verifyProductHeaderTest() {

        ProductDetailsPage productDetailsPage = new TelevisonsPage()
                .navigatetoTelevisionsPage()
                .filterByBrandName()
                .sortByPriceHighToLow()
                .openTheSecondHighestItem()
                .switchToProductDetailsPage();




        Assertions.assertThat(productDetailsPage.getAboutThisItem())
                .isEqualTo( "About this item");

        ExtentLogger.info(productDetailsPage.getProductDetails().toString());

    }


}
