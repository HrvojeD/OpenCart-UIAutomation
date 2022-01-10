package selenium_core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager{

    /*
    Set whether you want the browser windows to be visible during the tests or not

    true = browser window is hidden and the test step execution is not visible
    false = browser window is displayed and the test step execution is visible
     */
    boolean headless = false;

    //creating new FirefoxDriver
    @Override
    protected void createWebDriver() {

        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(headless);

        WebDriverManager.firefoxdriver().driverVersion("0.21.0").setup();
        this.driver = new FirefoxDriver(options);
    }
}
