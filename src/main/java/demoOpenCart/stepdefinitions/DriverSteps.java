package demoOpenCart.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
}
