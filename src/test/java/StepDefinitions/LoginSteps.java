package StepDefinitions;

import POM.LoginPage;
import Utils.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    @Given("Navigate to Luma Website")
    public void navigateToLumaWebsite() {

        BaseDriver.getDriver().get("https://magento.softwaretestingboard.com/");
        BaseDriver.getDriver().manage().window().maximize();

    }

    @And("Click to sign in menu button")
    public void clickToSignInMenuButton() {

        loginPage.findAndClick("signInMenuBtn");
    }

    @And("Fill in the email input as {string}")
    public void fillInTheEmailInputAs(String email) {
        loginPage.findAndSend("emailLogin",email);
    }

    @And("Fill in the password input as {string}")
    public void fillInThePasswordInputAs(String password) {
        loginPage.findAndSend("passwordLogin",password);

    }

    @When("Click to sign in button")
    public void clickToSignInButton() {
        loginPage.findAndClick("signInBtn");
    }

    @Then("Verify that you are logged in")
    public void verifyThatYouAreLoggedIn() {
        loginPage.findAndContainsText("successLogin","Welcome");
    }
}
