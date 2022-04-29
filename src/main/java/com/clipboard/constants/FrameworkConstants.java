package com.clipboard.constants;

public class FrameworkConstants {

    private FrameworkConstants() {

    }


    private static final String CHROMEDRIVERPATH  = System.getProperty("user.dir")+"/src/test/resources/Executables/chromedriver.exe";

    public static String getChromedriverpath()
    {
        return CHROMEDRIVERPATH;
    }
}
