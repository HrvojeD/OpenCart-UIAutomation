package demoOpenCart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static demoOpenCart.util.Helpers.waitUntilElementIsClickable;

public class FrontPagePO {

    WebDriver driver;

    //Front page constructor
    public FrontPagePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //search bar locator
    @FindBy(name = "search")
    WebElement searchBar;

    @FindBy(css = ".fa-search")
    WebElement searchButton;


    public void enterTextInSearchBar(String item) {
        waitUntilElementIsClickable(driver, searchBar);
        searchBar.sendKeys(item);
    }

    public void clickSearchButton() {
        waitUntilElementIsClickable(driver, searchButton);
        searchButton.click();
    }

}
