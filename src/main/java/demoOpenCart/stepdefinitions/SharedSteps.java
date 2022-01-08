package demoOpenCart.stepdefinitions;

import demoOpenCart.util.Settings;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static demoOpenCart.util.TestInitialization.driver;

public class SharedSteps {

    @Given("user is on store front page")
    public void userIsOnStoreFrontPage() {
        driver.get(Settings.STORE_FRONT_PAGE);
    }

    @When("user click the My Account button")
    public void userClickTheMyAccountButton() {
    }
}
