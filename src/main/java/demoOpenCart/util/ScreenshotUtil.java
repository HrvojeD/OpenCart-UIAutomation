package demoOpenCart.util;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static demoOpenCart.util.Settings.ERROR_SCREENSHOTS_PATH;

public class ScreenshotUtil {

    /*
    function that takes the screenshot every time one of the test steps fails and saves it
    in the resources/error_screenshots/ folder in the .png format
     */
    public static void takeScreenshotOnFailure(WebDriver driver,
                                               Scenario scenario) {
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
