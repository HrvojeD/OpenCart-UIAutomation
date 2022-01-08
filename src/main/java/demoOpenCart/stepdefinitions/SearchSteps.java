package demoOpenCart.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static demoOpenCart.util.TestInitialization.frontPagePO;

public class SearchSteps {

    @When("^user types (.*) in the search bar")
    public void userTypesItemInTheSearchBar(String item) {
        frontPagePO.enterTextInSearchBar(item);
    }

    @And("clicks the Search button")
    public void clicksTheSearchButton() {
        frontPagePO.clickSearchButton();
    }

    @Then("results will appear")
    public void resultsWillAppear() {
    }

}
