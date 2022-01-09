package demoOpenCart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static demoOpenCart.util.Helpers.*;

public class SharedPagePO {

    private final WebDriver driver;

    public SharedPagePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //'My Account' button locator
    @FindBy(css = ".fa-user")
    WebElement myAccountButton;

    //locator for Login button in the header
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(),'Login')]")
    WebElement loginHeaderButton;

    //locator for Logout button
    @FindBy(xpath = "//li/a[contains(text(),'Logout')]")
    WebElement logoutButton;

    //search bar locator
    @FindBy(name = "search")
    WebElement searchBar;

    //'start search' button locator
    @FindBy(css = ".fa-search")
    WebElement searchButton;

    //locator for Register button
    @FindBy(xpath = "//li/ul/li/a[contains(text(),'Register')]")
    WebElement registerButton;


    //click the My Account button to open a drop-down menu
    public SharedPagePO clickMyAccountButton() {
        waitUntilElementIsClickable(driver, myAccountButton);
        myAccountButton.click();
        return this;
    }

    //click the Register button
    public void clickRegisterButton() {
        waitUntilElementIsClickable(driver, registerButton);
        registerButton.click();
    }

    //click the Login button to log into a store
    public void clickLoginHeaderButton() {
        waitUntilElementIsClickable(driver, loginHeaderButton);
        loginHeaderButton.click();
    }

    //click the Logout button to log out of a store
    public void clickLogoutButton() {
        waitUntilElementIsClickable(driver, logoutButton);
        logoutButton.click();
    }

    //enter a text in the search bar
    public void enterTextInSearchBar(String item) {
        waitUntilElementIsClickable(driver, searchBar);
        searchBar.sendKeys(item);
    }

    //click the search button to start the search
    public void clickSearchButton() {
        waitUntilElementIsClickable(driver, searchButton);
        searchButton.click();
    }
}
