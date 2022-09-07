package POM;

import Utils.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddressPage extends BasePOM{

    public AddressPage(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }


    @FindBy(css = "[class=\"customer-menu\"] li:first-child")
    private WebElement myAccountBtn;

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    private WebElement manageAddressBtn;

    @FindBy(css = "button[role=\"add-address\"]")
    private WebElement addNewAddressBtn;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "telephone")
    private WebElement phone;

    @FindBy(id = "street_1")
    private WebElement addressInput1;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "region_id")
    private WebElement state;

    @FindBy(id = "zip")
    private WebElement zipcode;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "primary_shipping")
    private WebElement shippingAddressCheckbox;

    @FindBy(css = "[class='action save primary']")
    private WebElement saveAddressBtn;

    @FindBy(css = "[id='region_id']>option")
    private List<WebElement> cityList;

    WebElement myElement;

    public WebElement getAddNewAddressBtn(){
        return addNewAddressBtn;
    }

    public void findAndSend(String strElement, String value ){

        switch (strElement){
            case "company": myElement = company; break;
            case "phone": myElement = phone; break;
            case "addressInput1": myElement = addressInput1; break;
            case "city": myElement = city; break;
            case "zipcode": myElement = zipcode; break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement){

        switch (strElement){
            case "myAccountBtn": myElement = myAccountBtn; break;
            case "manageAddressBtn": myElement = manageAddressBtn; break;
            case "addNewAddressBtn": myElement = addNewAddressBtn; break;
            case "saveAddressBtn": myElement = saveAddressBtn; break;
        }
        clickFunction(myElement);
    }

    public void chooseElement(String strElement, String value){

        switch (strElement){
            case "state": myElement = state; break;
            case "country": myElement = country; break;
        }
        listSelectOption(myElement,value);
    }

}
