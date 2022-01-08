package demoOpenCart.util;

import demoOpenCart.pageObjects.FrontPagePO;
import org.openqa.selenium.WebDriver;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;

import static selenium_core.DriverType.CHROME;

public class TestInitialization {

    public static DriverManager driverManager;
    public static WebDriver driver;

    public static FrontPagePO frontPagePO;

    public static void getDriver() {
        driverManager = DriverManagerFactory.getDriverManager(CHROME);
        driver = driverManager.getWebDriver();
    }

    public static void setUpPageObjects() {
        frontPagePO = new FrontPagePO(driver);
    }

    public static void tearDown() {
        driverManager.quitWebDriver();
    }
}
