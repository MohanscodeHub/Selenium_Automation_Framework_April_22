package com.clipboard.tests;


import com.clipboard.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginpageTests  extends BaseTest {

    private LoginpageTests() {
    }

    @Test
    public void test1(){
    System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com");
    driver.quit();

}

}
