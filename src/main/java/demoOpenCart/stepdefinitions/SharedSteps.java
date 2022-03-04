package demoOpenCart.stepdefinitions;

import demoOpenCart.util.Settings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static demoOpenCart.util.TestInitialization.driver;
import static demoOpenCart.util.TestInitialization.sharedPagePO;

public class SharedSteps {

    @And("user is on store front page")
    public void userIsOnStoreFrontPage() {
        driver.get(Settings.STORE_FRONT_PAGE);
    }

    @When("user click the My Account button")
    public void userClickTheMyAccountButton() {
        sharedPagePO.clickMyAccountButton();
    }

    @And("clicks the Register button")
    public void clicksTheRegisterButton() {
        sharedPagePO.clickRegisterButton();
    }

    @And("clicks the Login header button")
    public void clickLoginHeaderButton() {
        sharedPagePO.clickLoginHeaderButton();
    }

    @And("click the Logout button")
    public void clickTheLogoutButton() {
        sharedPagePO.clickLogoutButton();
    }

}
