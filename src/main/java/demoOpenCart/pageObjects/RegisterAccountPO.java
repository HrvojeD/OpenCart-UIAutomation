package demoOpenCart.pageObjects;

import demoOpenCart.util.Helpers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static demoOpenCart.util.Helpers.waitForElementVisibility;
import static demoOpenCart.util.Helpers.waitUntilElementIsClickable;

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

    public void enterFirstName(String firstName) {
        waitUntilElementIsClickable(driver, firstNameTxtField);
        firstNameTxtField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        waitUntilElementIsClickable(driver, lastNameTxtField);
        lastNameTxtField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        waitUntilElementIsClickable(driver, emailTxtField);
        emailTxtField.sendKeys(email);
    }

    public void enterTelephone(String telephone) {
        waitUntilElementIsClickable(driver, telephoneTxtField);
        telephoneTxtField.sendKeys(telephone);
    }

    public void enterPassword(String password) {
        waitUntilElementIsClickable(driver, pwTxtField);
        pwTxtField.sendKeys(password);
    }

    public void enterPasswordConfirmation(String password) {
        waitUntilElementIsClickable(driver, pwConfirmationTxtField);
        pwConfirmationTxtField.sendKeys(password);
    }

    public void checkPrivacyPolicyCheckbox() {
        waitUntilElementIsClickable(driver, agreeCheckbox);
        agreeCheckbox.click();
    }

    public void clickContinueButton() {
        waitUntilElementIsClickable(driver, continueButton);
        continueButton.click();
    }

    public void verifySuccessMessage(String message) {
        waitForElementVisibility(driver, accountCreatedLabel);
        Assert.assertEquals(message, accountCreatedLabel.getText());
    }
}
