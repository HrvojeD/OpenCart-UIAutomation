package demoOpenCart.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static demoOpenCart.util.ElementVisibilityUtil.waitForElementVisibility;
import static demoOpenCart.util.ElementVisibilityUtil.waitUntilElementIsClickable;

public class RegisterAccountPO {

    private final WebDriver driver;

    public RegisterAccountPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locator for First Name input field
    @FindBy(id = "input-firstname")
    WebElement firstNameTxtField;

    //locator for Last Name input field
    @FindBy(id = "input-lastname")
    WebElement lastNameTxtField;

    //locator for Email input field
    @FindBy(id = "input-email")
    WebElement emailTxtField;

    //locator for Telephone input field
    @FindBy(id = "input-telephone")
    WebElement telephoneTxtField;

    //locator for Password input field
    @FindBy(id = "input-password")
    WebElement pwTxtField;

    //locator for Password Confirm input field
    @FindBy(id = "input-confirm")
    WebElement pwConfirmationTxtField;

    //locator for 'Agree to the Privacy Policy' button
    @FindBy(css = "input[name='agree']")
    WebElement agreeCheckbox;

    //locator for Continue button
    @FindBy(css = "input[value='Continue']")
    WebElement continueButton;

    //locator for success message header
    @FindBy(css = "#common-success #content > h1")
    WebElement accountCreatedLabel;


    //type first name in the First Name field on the registration form
    public RegisterAccountPO enterFirstName(String firstName) {
        waitUntilElementIsClickable(driver, firstNameTxtField);
        firstNameTxtField.sendKeys(firstName);
        return this;
    }

    //type last name in the Last Name field on the registration form
    public RegisterAccountPO enterLastName(String lastName) {
        waitUntilElementIsClickable(driver, lastNameTxtField);
        lastNameTxtField.sendKeys(lastName);
        return this;
    }

    //type email in the Email field on the registration form
    public RegisterAccountPO enterEmail(String email) {
        waitUntilElementIsClickable(driver, emailTxtField);
        emailTxtField.sendKeys(email);
        return this;
    }

    //type telephone number in the Telephone field on the registration form
    public RegisterAccountPO enterTelephone(String telephone) {
        waitUntilElementIsClickable(driver, telephoneTxtField);
        telephoneTxtField.sendKeys(telephone);
        return this;
    }

    //type password in the Password field on the registration form
    public RegisterAccountPO enterPassword(String password) {
        waitUntilElementIsClickable(driver, pwTxtField);
        pwTxtField.sendKeys(password);
        return this;
    }

    //type password in the Confirm Password field on the registration form
    public RegisterAccountPO enterPasswordConfirmation(String password) {
        waitUntilElementIsClickable(driver, pwConfirmationTxtField);
        pwConfirmationTxtField.sendKeys(password);
        return this;
    }

    //check the 'Agree to Privacy Policy' checkbox
    public RegisterAccountPO checkPrivacyPolicyCheckbox() {
        waitUntilElementIsClickable(driver, agreeCheckbox);
        agreeCheckbox.click();
        return this;
    }

    //click the Continue button to finish registration
    public void clickContinueButton() {
        waitUntilElementIsClickable(driver, continueButton);
        continueButton.click();
    }

    //verify message that is displayed after clicking Continue on the registration form
    public void verifySuccessMessage(String message) {
        waitForElementVisibility(driver, accountCreatedLabel);
        Assert.assertEquals(message, accountCreatedLabel.getText());
    }
}
