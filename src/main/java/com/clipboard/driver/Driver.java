package com.clipboard.driver;

import com.clipboard.constants.FrameworkConstants;
import com.clipboard.utils.Readfile_util;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

    private Driver(){


    }




    public static void initDriver() {
        if (Objects.isNull(DriverManager.getDriver())) {

            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(Readfile_util.CONFIGMAP.get("url"));

        }

    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
