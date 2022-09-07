package StepDefinitions;

import POM.AccountPage;
import POM.AddressPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressSteps {

    AddressPage addressPage = new AddressPage();
    AccountPage accountPage = new AccountPage();
    @And("Click to My Account Menu button")
    public void clickToMyAccountMenuButton() throws InterruptedException{

        accountPage.findAndClick("dropdownBtn");
        addressPage.findAndClick("myAccountBtn");

    }

    @And("Click to Manage Address button")
    public void clickToManageAddressButton() throws InterruptedException{

        addressPage.findAndClick("manageAddressBtn");
        if (addressPage.getAddNewAddressBtn().isDisplayed()){
            addressPage.findAndClick("addNewAddressBtn");
        }

    }
    @And("Click to Add New Address button")
    public void clickToAddNewAddressButton() throws InterruptedException {
        addressPage.findAndClick("addNewAddressBtn");
    }

    @And("Fill in the Company input as {string}")
    public void fillInTheCompanyInputAs(String company) {
        addressPage.findAndSend("company",company);
    }

    @And("Fill in the Phone Number input as {string}")
    public void fillInThePhoneNumberInputAs(String phone) {
        addressPage.findAndSend("phone",phone);
    }

    @And("Fill in the Street addres first input as {string}")
    public void fillInTheStreetAddresFirstInputAs(String address1) {
        addressPage.findAndSend("addressInput1",address1);
    }

    @And("Fill in the city input as {string}")
    public void fillInTheCityInputAs(String city) {
        addressPage.findAndSend("city",city);
    }

    @And("Fill in the Zip Code input as {string}")
    public void fillInTheZipCodeInputAs(String zipcode) {
        addressPage.findAndSend("zipcode",zipcode);
    }

    @And("Select a state")
    public void selectAState() {
        addressPage.chooseElement("state","18");
    }

    @And("Select a country")
    public void selectACountry() {
        addressPage.chooseElement("country","US");
    }

    @When("Click to save address button")
    public void clickToSaveAddressButton() {
        addressPage.findAndClick("saveAddressBtn");
    }

    @Then("Saved message should be displayed")
    public void savedMessageShouldBeDisplayed() {
        accountPage.findAndContainsText("successMessage","saved");

    }

    @And("Click to address sign out button")
    public void clickToAddressSignOutButton() {

        accountPage.findAndClick("dropdownBtn");
        accountPage.findAndClick("signOutBtn");
    }


}
