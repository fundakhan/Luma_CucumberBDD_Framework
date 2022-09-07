package StepDefinitions;

import POM.AccountPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class AccountSteps {

    AccountPage accountPage = new AccountPage();
    @And("Click to Create Account Menu button")
    public void clickToCreateAccountMenuButton(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (String str : listElements) {
            accountPage.findAndClick(str);

        }
    }

    @And("Fill in the First Name, Last Name, Email, Password, Confirm Password inputs")
    public void fillInTheFirstNameLastNameEmailPasswordConfirmPasswordInputs(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            accountPage.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));

        }
    }

    @When("Click to Create Account button")
    public void clickToCreateAccountButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String str : listElement){
            accountPage.findAndClick(str);
        }
    }

    @When("Successfully message should be displayed")
    public void successfullyMessageShouldBeDisplayed() {

        accountPage.findAndContainsText("successMessage", "Thank you");
    }

    @And("Click to sign out button")
    public void clickToSignOutButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            accountPage.findAndClick("dropdownBtn");

        }
    }
}
