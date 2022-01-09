package demoOpenCart.stepdefinitions;

import demoOpenCart.util.Settings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static demoOpenCart.util.TestInitialization.registerAccountPO;

public class RegistrationSteps {

    @And("^enters (.*) in the First Name field")
    public void entersFirstnameInTheFirstNameField(String firstname) {
        registerAccountPO.enterFirstName(firstname);
    }

    @And("^enters (.*) in the Last Name field")
    public void entersLastnameInTheLastNameField(String lastname) {
        registerAccountPO.enterLastName(lastname);
    }

    @And("^enters (.*) in the Email address field")
    public void entersEmailInTheEmailAddressField(String email) {
        registerAccountPO.enterEmail(email);
    }

    @And("^enters (.*) in the Telephone field")
    public void entersTelephoneInTheTelephoneField(String telephone) {
        registerAccountPO.enterTelephone(telephone);
    }

    @And("^enters (.*) in the Password field")
    public void entersPasswordInThePasswordField(String password) {
        registerAccountPO.enterPassword(password);
    }

    @And("^enters (.*) in the Password Confirm field")
    public void entersPasswordInThePasswordConfirmField(String password) {
        registerAccountPO.enterPasswordConfirmation(password);
    }

    @And("checks the Privacy Policy checkbox")
    public void checksThePrivacyPolicyCheckbox() {
        registerAccountPO.checkPrivacyPolicyCheckbox();
    }

    @And("clicks Continue")
    public void clicksContinue() {
        registerAccountPO.clickContinueButton();
    }

    @Then("new account will be created")
    public void newAccountWillBeCreated() {
        registerAccountPO.verifySuccessMessage(Settings.ACCOUNT_CREATED_MESSAGE);
    }
}
