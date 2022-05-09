package com.clipboard.constants;

public class FrameworkConstants {

    private FrameworkConstants() {

    }


    private static final String CHROMEDRIVERPATH  = System.getProperty("user.dir")+"/src/test/resources/Executables/chromedriver.exe";
    private static final String CONFIGFILEPATH  = System.getProperty("user.dir")+"/src/test/resources/config.properties";
    private static final String EXTENTREPORTPATH  = System.getProperty("user.dir")+"/src/test/resources/config.properties";

    private static final int TIMEOUT = 10;
    public static String getChromedriverpath()
    {
        return CHROMEDRIVERPATH;
    }

    public static String getConfigfilepath()
    {
        return CONFIGFILEPATH;
    }

    public static int getTIMEOUT()
    {
        return TIMEOUT;
    }

    public static String getExtentreportpath()
    {
        return EXTENTREPORTPATH;
    }

}
