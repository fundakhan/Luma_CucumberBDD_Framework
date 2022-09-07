package StepDefinitions;

import POM.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {

    ProductPage productPage = new ProductPage();
    @And("Click to Women Menu button")
    public void clickToWomenMenuButton() {
        productPage.findAndClick("womenMenuBtn");
    }

    @And("Click to jackets button")
    public void clickToJacketsButton() {
        productPage.findAndClick("jacketsBtn");
    }

    @And("Click to random product")
    public void clickToRandomProduct() {
        productPage.chooseAndClick("productList");
    }

    @And("Click to random size")
    public void clickToRandomSize() throws InterruptedException {
        productPage.chooseAndClick("sizeList");
        Thread.sleep(3000);
    }

    @And("Click to random color")
    public void clickToRandomColor() throws InterruptedException {
        productPage.chooseAndClick("colorList");
        Thread.sleep(3000);
        
    }

    @And("Click to Add To Cart button")
    public void clickToAddToCartButton() throws InterruptedException {
        productPage.findAndClick("addToCart");
        Thread.sleep(3000);
    }

    @And("Click to shopping Cart")
    public void clickToShoppingCart() throws InterruptedException {
        productPage.findAndClick("shoppingCart");
        Thread.sleep(3000);
    }

    @And("Click to proceed to Checkout button")
    public void clickToProceedToCheckoutButton() throws InterruptedException {
        productPage.findAndClick("proceedToCheckout");
        Thread.sleep(3000);
    }

    @And("Click to random shipping method")
    public void clickToRandomShippingMethod() throws InterruptedException {
        productPage.chooseAndClick("radioBtnList");
        Thread.sleep(3000);
    }

    @And("Click to next button")
    public void clickToNextButton() throws InterruptedException {
        productPage.findAndClick("nextBtn");
        Thread.sleep(3000);
    }

    @When("Click to  place order button")
    public void clickToPlaceOrderButton() throws InterruptedException {
        productPage.findAndClick("placeOrderBtn");
        Thread.sleep(3000);
        
    }
    @Then("Purchase message should be displayed")
    public void purchaseMessageShouldBeDisplayed() throws InterruptedException {
        productPage.findAndContainsText("purchaseMessage","Thank you");
        Thread.sleep(3000);
    }
}
