package demoOpenCart.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementVisibilityUtil {

    //explicit private constructor
    private ElementVisibilityUtil() {}

    //function that checks if the element is visible on the page
    public static void waitForElementVisibility(WebDriver driver,
                                                WebElement element) {
        new WebDriverWait(driver, 6)
                .pollingEvery(Duration.ofMillis(100))
                .until(ExpectedConditions.visibilityOf(element));
    }

    //function that checks if the element is clickable
    public static void waitUntilElementIsClickable(WebDriver driver,
                                                   WebElement element) {
        new WebDriverWait(driver, 6)
                .pollingEvery(Duration.ofMillis(100))
                .until(ExpectedConditions.elementToBeClickable(element));
    }
}
