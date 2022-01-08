package selenium_core;

public class DriverManagerFactory {

    //depending on the driverType, getting or creating one of the WebDrivers
    public static DriverManager getDriverManager(DriverType driverType) {

        return switch (driverType) {
            case CHROME -> new ChromeDriverManager();
            case FIREFOX -> new FirefoxDriverManager();
        };
    }
}
