package demoOpenCart.util;

import demoOpenCart.pageObjects.*;
import org.openqa.selenium.WebDriver;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;

import static selenium_core.DriverType.CHROME;
import static selenium_core.DriverType.FIREFOX;

public class TestInitialization {

    //explicit private constructor
    private TestInitialization() {}

    public static DriverManager driverManager;
    public static WebDriver driver;

    public static RegisterAccountPO registerAccountPO;
    public static SearchResultPO searchResultPO;
    public static SharedPagePO sharedPagePO;
    public static AccountPO accountPO;
    public static LogoutPO logoutPO;
    public static LoginPO loginPage;

    /*
    Getting the specified driver.
    Supported drivers can be found in the DriverType enum in the selenium_core package.

    To change the browser in which tests are executing, replace getDriverManager() argument
    with enum of the wanted browser.
     */
    public static void getDriver() {
        driverManager = DriverManagerFactory.getDriverManager(FIREFOX);
        driver = driverManager.getWebDriver();
    }

    //creating instances of all page objects
    public static void setUpPageObjects() {
        registerAccountPO = new RegisterAccountPO(driver);
        searchResultPO = new SearchResultPO(driver);
        sharedPagePO = new SharedPagePO(driver);
        accountPO = new AccountPO(driver);
        logoutPO = new LogoutPO(driver);
        loginPage = new LoginPO(driver);

    }

    //tear down the driver object
    public static void tearDown() {
        driverManager.quitWebDriver();
    }
}
