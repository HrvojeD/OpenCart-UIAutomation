package demoOpenCart.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static demoOpenCart.util.Helpers.waitForElementVisibility;

public class AccountPO {

    private final WebDriver driver;

    public AccountPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locator for My Account label
    @FindBy(xpath = "//div[@id='content']/h2[contains(text(),'My Account')]")
    WebElement myAccountLabel;

    //locator for My Orders label
    @FindBy(xpath = "//div[@id='content']/h2[contains(text(),'My Orders')]")
    WebElement myOrdersLabel;


    //verify that the My Account label is correctly displayed
    public AccountPO isMyAccountLabelDisplayed(String label) {
        waitForElementVisibility(driver, myAccountLabel);
        Assert.assertEquals(label, myAccountLabel.getText());
        return this;
    }

    //verify that the My Account label is correctly displayed
    public void isMyOrdersLabelDisplayed(String label) {
        waitForElementVisibility(driver, myOrdersLabel);
        Assert.assertEquals(label, myOrdersLabel.getText());
    }
}
