package selenium_core;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract void createWebDriver();

    /*
    calling this method will create new driver if none exists,
    otherwise it will return the existing driver
     */
    public WebDriver getWebDriver() {
        if (driver == null) {
            createWebDriver();
        }
        return driver;
    }

    /*
    calling this method will quit the existing driver
     */
    public void quitWebDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
