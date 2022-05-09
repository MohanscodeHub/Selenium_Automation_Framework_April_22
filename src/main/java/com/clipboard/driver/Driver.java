package com.clipboard.driver;

import com.clipboard.config.ConfigFactory;
import com.clipboard.constants.FrameworkConstants;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

    private Driver(){


    }




    public static void initDriver() {
        if (Objects.isNull(DriverManager.getDriver())) {


            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());

        }

        DriverManager.getDriver().manage().window().maximize();

    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
