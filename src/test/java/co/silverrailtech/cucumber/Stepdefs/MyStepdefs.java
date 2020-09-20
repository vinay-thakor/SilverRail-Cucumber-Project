package co.silverrailtech.cucumber.Stepdefs;

import co.silverrailtech.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on contact us link$")
    public void iClickOnContactUsLink() {
        new HomePage().clickOnContactUs();

    }

    @And("^I click on our office$")
    public void iClickOnOurOffice() {
        new HomePage().clickOnOurOffice();
    }

    @Then("^I should see UK office address$")
    public void iShouldSeeUKOfficeAddress() {
    }
}
