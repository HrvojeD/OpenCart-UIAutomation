package demoOpenCart.stepdefinitions;

import demoOpenCart.util.EmailFactoryUtil;
import demoOpenCart.util.Settings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static demoOpenCart.util.TestInitialization.registerAccountPO;

public class RegistrationSteps {

    @And("enters firstname in the First Name field")
    public void entersFirstnameInTheFirstNameField() {
        registerAccountPO.enterFirstName(Settings.FIRST_NAME);
    }

    @And("enters lastname in the Last Name field")
    public void entersLastnameInTheLastNameField() {
        registerAccountPO.enterLastName(Settings.LAST_NAME);
    }

    @And("enters email in the Email address field")
    public void entersEmailInTheEmailAddressField() {
        registerAccountPO.enterEmail(EmailFactoryUtil.createNewEmailAddress());
    }

    @And("enters telephone in the Telephone field")
    public void entersTelephoneInTheTelephoneField() {
        registerAccountPO.enterTelephone(Settings.TELEPHONE);
    }

    @And("enters password in the Password field")
    public void entersPasswordInThePasswordField() {
        registerAccountPO.enterPassword(Settings.PASSWORD);
    }

    @And("enters password in the Password Confirm field")
    public void entersPasswordInThePasswordConfirmField() {
        registerAccountPO.enterPasswordConfirmation(Settings.PASSWORD);
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
