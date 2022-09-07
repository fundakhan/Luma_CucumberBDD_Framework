package POM;

import Utils.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePOM{

    public AccountPage(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(css = "[class=\"panel header\"] li:last-child")
    private WebElement createAccountMenuBtn;

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "email_address")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "password-confirmation")
    private WebElement passwordConfirm;

    @FindBy(css = "[class=\"action submit primary\"]")
    private WebElement createAccountBtn;

    @FindBy(css = "div[data-bind^=html]")
    private WebElement successMessage;

    @FindBy(xpath = "(//button[@class=\"action switch\"])[1]")
    private WebElement dropdownBtn;

    @FindBy(xpath = "(//*[@class=\"authorization-link\"])[1]")
    private WebElement signOutBtn;

    WebElement myElement;

    public void findAndSend(String strElement, String value){

        switch (strElement){
            case "firstName": myElement = firstName; break;
            case "lastName": myElement = lastName; break;
            case "email": myElement = email; break;
            case "password": myElement = password; break;
            case "passwordConfirm": myElement = passwordConfirm; break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement){

        switch (strElement){
            case "createAccountMenuBtn": myElement = createAccountMenuBtn; break;
            case "createAccountBtn": myElement = createAccountBtn; break;
            case "dropdownBtn": myElement = dropdownBtn; break;
            case "signOutBtn": myElement = signOutBtn; break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){

        switch (strElement){
            case "successMessage": myElement = successMessage; break;

        }
        verifyContainsText(myElement,text);
    }

}
