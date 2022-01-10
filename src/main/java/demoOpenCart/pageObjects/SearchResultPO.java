package demoOpenCart.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static demoOpenCart.util.Helpers.waitForElementVisibility;

public class SearchResultPO {

    private final WebDriver driver;

    public SearchResultPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locator for product div in search results
    @FindBy(css = ".product-thumb")
    WebElement productDiv;


    //check if the search was successful
    public void isSearchResultDisplayed() {
        waitForElementVisibility(driver, productDiv);
        Assert.assertTrue(productDiv.isDisplayed());
    }
}
