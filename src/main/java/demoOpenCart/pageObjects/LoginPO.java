package demoOpenCart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static demoOpenCart.util.ElementVisibilityUtil.waitUntilElementIsClickable;

public class LoginPO {

    private final WebDriver driver;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locator for Email input field
    @FindBy(id = "input-email")
    WebElement emailTxtField;

    //locator for Password input field
    @FindBy(id = "input-password")
    WebElement pwTxtField;

    //locator for login button in the Returning Customer section
    @FindBy(css = "form[method='post'] > input[value='Login']")
    WebElement loginButton;


    //type email address in the Email field
    public LoginPO enterEmail(String email) {
        waitUntilElementIsClickable(driver, emailTxtField);
        emailTxtField.sendKeys(email);
        return this;
    }

    //type password in the Password field
    public LoginPO enterPassword(String password) {
        waitUntilElementIsClickable(driver, pwTxtField);
        pwTxtField.sendKeys(password);
        return this;
    }

    //click the Login button to login
    public void clickLoginButton() {
        waitUntilElementIsClickable(driver, loginButton);
        loginButton.click();
    }

}
