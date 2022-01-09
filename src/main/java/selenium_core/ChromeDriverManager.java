package selenium_core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager{

    /*
    Set whether you want the browser windows to be visible during the tests or not

    true = browser window is hidden and the test steps are not visible
    false = browser window is displayed and the test steps are visible
     */
    boolean headless = false;

    //setting ChromeOptions and creating new ChromeDriver
    @Override
    protected void createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--no-sandbox");
        options.addArguments("--dns-prefetch-disable");
        options.addArguments("enable-automation");
        options.addArguments("disable-features=NetworkService");

        options.setHeadless(headless);
        options.addArguments(headless ? "--window-size=1920,1080" : "--kiosk");

        this.driver = new ChromeDriver(options);
    }
}
