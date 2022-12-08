package com.pluralsight;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class UnitTest {
    @BeforeAll
    public static void setup() {

        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\AutomationTests\\TestFramework\\Tests\\chromedriver_win32\\chromedriver.exe");
    }
    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Assertions.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToAuthorsPage(){
        Pages.authorPages().goTo();
        Assertions.assertTrue(Pages.authorPages().isAt());
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }
}
