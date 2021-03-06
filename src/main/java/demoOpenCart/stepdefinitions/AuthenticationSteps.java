package demoOpenCart.stepdefinitions;

import demoOpenCart.util.EmailFactoryUtil;
import demoOpenCart.util.Settings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static demoOpenCart.util.TestInitialization.*;

public class AuthenticationSteps {

    String generatedEmail = EmailFactoryUtil.createNewEmailAddress();

    @Given("user is already registered")
    public void userIsAlreadyRegistered() {
        driver.get(Settings.STORE_FRONT_PAGE);

        sharedPagePO.clickMyAccountButton()
                    .clickRegisterButton();

        registerAccountPO.enterFirstName(Settings.FIRST_NAME)
                         .enterLastName(Settings.LAST_NAME)
                         .enterEmail(generatedEmail)
                         .enterTelephone(Settings.TELEPHONE)
                         .enterPassword(Settings.PASSWORD)
                         .enterPasswordConfirmation(Settings.PASSWORD)
                         .checkPrivacyPolicyCheckbox()
                         .clickContinueButton();

        sharedPagePO.clickMyAccountButton()
                    .clickLogoutButton();
    }

    @And("enters valid credentials")
    public void entersValidCredentials() {
        loginPage.enterEmail(generatedEmail)
                 .enterPassword(Settings.PASSWORD);
    }

    @Then("user will be logged in")
    public void userWillBeLoggedIn() {
        accountPO.isMyAccountLabelDisplayed(Settings.MY_ACCOUNT_LABEL)
                 .isMyOrdersLabelDisplayed(Settings.MY_ORDERS_LABEL);
    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
        sharedPagePO.clickMyAccountButton()
                    .clickLoginHeaderButton();

        loginPage.enterEmail(generatedEmail)
                 .enterPassword(Settings.PASSWORD)
                 .clickLoginButton();
    }

    @Then("user will be logged out")
    public void userWillBeLoggedOut() {
        logoutPO.verifyLogoutLabelIsDisplayed(Settings.LOGGED_OFF_MESSAGE);
    }

    @And("clicks the Login button")
    public void clicksTheLoginButton() {
        loginPage.clickLoginButton();
    }
}
