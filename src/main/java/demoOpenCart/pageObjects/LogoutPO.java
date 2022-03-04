package demoOpenCart.pageObjects;

import demoOpenCart.util.ElementVisibilityUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPO {

    private final WebDriver driver;

    public LogoutPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locator for 'You have been logged off...' message after logging out
    @FindBy(xpath = "//div[@id='content']/p[contains(text(),'You have been logged off')]")
    WebElement loggedOffLabel;


    //verify if the correct label displayed
    public void verifyLogoutLabelIsDisplayed(String label) {
        ElementVisibilityUtil.waitForElementVisibility(driver, loggedOffLabel);
        Assert.assertTrue(loggedOffLabel.getText().contains(label));
    }
}
