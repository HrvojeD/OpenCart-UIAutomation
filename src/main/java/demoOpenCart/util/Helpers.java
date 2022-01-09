package demoOpenCart.util;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

import static demoOpenCart.util.Settings.ERROR_SCREENSHOTS_PATH;

public class Helpers {

    //explicit private constructor
    private Helpers() {}

    //function that checks if the element is visible on the page
    public static void waitForElementVisibility(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(6))
                .pollingEvery(Duration.ofMillis(100))
                .until(ExpectedConditions.visibilityOf(element));
    }

    //function that checks if the element is clickable
    public static void waitUntilElementIsClickable(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(6))
                .pollingEvery(Duration.ofMillis(100))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    //function that checks if the wanted text is displayed
    public static void waitUntilTextIsDisplayed(WebDriver driver, WebElement element, String text) {
        new WebDriverWait(driver, Duration.ofSeconds(6))
                .pollingEvery(Duration.ofMillis(100))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    //function that takes the screenshot every time one of the test steps fails
    public static void takeScreenshotOnFailure(WebDriver driver, Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File (ERROR_SCREENSHOTS_PATH
                        + scenario.getName().trim()
                        + scenario.getId().replace("/", "_")
                                          .replaceAll("(?=:)(.*)(?=_)", "")
                        + ".png"));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
