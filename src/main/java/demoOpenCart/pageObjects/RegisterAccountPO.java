package demoOpenCart.pageObjects;

import demoOpenCart.util.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    public void enterFirstName(String firstName) {
        Helpers.waitUntilElementIsClickable(driver, firstNameTxtField);
        firstNameTxtField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        Helpers.waitUntilElementIsClickable(driver, lastNameTxtField);
        lastNameTxtField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        Helpers.waitUntilElementIsClickable(driver, emailTxtField);
        emailTxtField.sendKeys(email);
    }

    public void enterTelephone(String telephone) {
        Helpers.waitUntilElementIsClickable(driver, telephoneTxtField);
        telephoneTxtField.sendKeys(telephone);
    }

    public void enterPassword(String password) {
        Helpers.waitUntilElementIsClickable(driver, pwTxtField);
        pwTxtField.sendKeys(password);
    }

    public void enterPasswordConfirmation(String password) {
        Helpers.waitUntilElementIsClickable(driver, pwConfirmationTxtField);
        pwConfirmationTxtField.sendKeys(password);
    }
}
