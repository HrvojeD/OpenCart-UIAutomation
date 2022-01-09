package demoOpenCart.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static demoOpenCart.util.Helpers.takeScreenshotOnFailure;
import static demoOpenCart.util.TestInitialization.*;

public class DriverSteps {

    @Before
    public void initialize() {
        getDriver();
        setUpPageObjects();
    }

    @After
    public void quit() {
        tearDown();
    }

    @AfterStep
    public void takeScreenshotOnFail(Scenario scenario) {
        takeScreenshotOnFailure(driver, scenario);
    }
}
