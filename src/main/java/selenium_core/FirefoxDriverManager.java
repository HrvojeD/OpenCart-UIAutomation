package selenium_core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    @Override
    protected void createWebDriver() {
        WebDriverManager.firefoxdriver().setup();

        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
    }
}
