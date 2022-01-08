package demoOpenCart.util;

import demoOpenCart.pageObjects.RegisterAccountPO;
import demoOpenCart.pageObjects.SearchResultPO;
import demoOpenCart.pageObjects.SharedPagePO;
import org.openqa.selenium.WebDriver;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;

import static selenium_core.DriverType.CHROME;

public class TestInitialization {

    public static DriverManager driverManager;
    public static WebDriver driver;

    public static RegisterAccountPO registerAccountPO;
    public static SearchResultPO searchResultPO;
    public static SharedPagePO sharedPagePO;

    public static void getDriver() {
        driverManager = DriverManagerFactory.getDriverManager(CHROME);
        driver = driverManager.getWebDriver();
    }

    public static void setUpPageObjects() {
        registerAccountPO = new RegisterAccountPO(driver);
        searchResultPO = new SearchResultPO(driver);
        sharedPagePO = new SharedPagePO(driver);
    }

    public static void tearDown() {
        driverManager.quitWebDriver();
    }
}
