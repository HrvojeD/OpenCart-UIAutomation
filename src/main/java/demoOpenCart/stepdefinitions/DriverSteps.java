package demoOpenCart.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static demoOpenCart.util.ScreenshotUtil.takeScreenshotOnFailure;
import static demoOpenCart.util.TestInitialization.*;

public class DriverSteps {

    //initialize driver and page objects before every scenario
    @Before
    public void initialize() {
        getDriver();
        setUpPageObjects();
    }

    //tear down driver after every scenario
    @After
    public void quit() {
        tearDown();
    }

    //perform check after every step in scenario and if step failed take screenshot
    @AfterStep
    public void takeScreenshotOnFail(Scenario scenario) {
        takeScreenshotOnFailure(driver, scenario);
    }
}
