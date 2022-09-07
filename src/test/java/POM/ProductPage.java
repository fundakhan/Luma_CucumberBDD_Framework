package POM;

import Utils.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends BasePOM{

    public ProductPage(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }


    @FindBy(id = "ui-id-4")
    private WebElement womenMenuBtn;

    @FindBy(xpath = "(//*[text()='Jackets'])[3]")
    private WebElement jacketsBtn;

    @FindAll(@FindBy(css = "[class='products list items product-items']>li"))
    private List<WebElement> productList;

    @FindAll(@FindBy(xpath = "(//*[@class='swatch-attribute-options clearfix'])[1]/div"))
    private List<WebElement> sizeList;

    @FindAll(@FindBy(xpath = "(//*[@class='swatch-attribute-options clearfix'])[2]/div"))
    private List<WebElement> colorList;

    @FindBy(id = "product-addtocart-button")
    private WebElement addToCart;

    @FindBy(xpath = "//a[text()='shopping cart']")
    private WebElement shoppingCart;

    @FindBy(css = "li [class=\"action primary checkout\"]")
    private WebElement proceedToCheckout;

    @FindAll(@FindBy(css = "[id=\"checkout-shipping-method-load\"] input"))
    private List<WebElement> radioBtnList;


    @FindBy(css = "[data-role=\"opc-continue\"]")
    private WebElement nextBtn;

    @FindBy(css = "[class=\"action primary checkout\"]")
    private WebElement placeOrderBtn;

    @FindBy(css = "[data-ui-id=\"page-title-wrapper\"]")
    private WebElement purchaseMessage;
    @FindBy(xpath = "(//select[@class=\"select\"])[1]")
    private WebElement checkOutState;

    @FindBy(xpath = "(//input[@class=\"input-text\"])[5]")
    private WebElement checkOutCompany;

    @FindBy(xpath = "(//input[@class=\"input-text\"])[6]")
    private WebElement checkOutStreet;

    @FindBy(xpath = "(//input[@class=\"input-text\"])[9]")
    private WebElement checkOutCity;

    @FindBy(xpath = "(//select[@class=\"select\"])[2]")
    private WebElement checkOutCountry;

    @FindBy(xpath = "(//input[@class=\"input-text\"])[12]")
    private WebElement checkOutPhone;

    @FindBy(xpath = "(//input[@class=\"input-text\"]) [11]")
    private WebElement checkOutZipcode;

    @FindBy(css = ".new-address-popup>button")
    private WebElement checkoutAddress;

    WebElement myElement;
    List<WebElement> myListElement;

    public void findAndSend(String strElement, String value){

        switch (strElement){
            case "checkOutCompany": myElement = checkOutCompany; break;
            case "checkOutStreet": myElement = checkOutStreet; break;
            case "checkOutCity": myElement = checkOutCity; break;
            case "checkOutPhone": myElement = checkOutPhone; break;
            case "checkOutZipcode": myElement = checkOutZipcode; break;
        }
        sendKeysFunction(myElement,value);
    }

    public void chooseElement(String strElement, String value){

        switch (strElement){
            case "checkOutCountry": myElement = checkOutCountry; break;
            case "checkOutState": myElement = checkOutState; break;
        }
        listSelectOption(myElement,value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "womenMenuBtn": myElement = womenMenuBtn; break;
            case "jacketsBtn": myElement = jacketsBtn; break;
            case "addToCart": myElement = addToCart; break;
            case "proceedToCheckout": myElement = proceedToCheckout; break;
            case "nextBtn": myElement = nextBtn; break;
            case "shoppingCart": myElement = shoppingCart; break;
            case "placeOrderBtn": myElement = placeOrderBtn; break;
            case "checkoutAddress": myElement = checkoutAddress; break;

        }
        waitUntilLoading();

        clickFunction(myElement);
    }

    public void chooseAndClick(String strElement){
        switch (strElement){
            case "productList": myListElement = productList; break;
            case "sizeList": myListElement = sizeList; break;
            case "colorList": myListElement = colorList; break;
            case "radioBtnList": myListElement = radioBtnList; break;

        }
        waitUntilLoading();
        clickRandomFromAList(myListElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement){
            case "purchaseMessage": myElement = purchaseMessage; break;
        }
        verifyContainsText(myElement,text);
    }

}
