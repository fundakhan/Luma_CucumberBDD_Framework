package POM;

import Utils.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePOM{

    public LoginPage(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Sign In")
    private WebElement signInMenuBtn;

    @FindBy(id = "email")
    private WebElement emailLogin;

    @FindBy(id = "pass")
    private WebElement passwordLogin;

    @FindBy(id = "send2")
    private WebElement signInBtn;

    @FindBy(xpath = "(//span[contains(text(),'Welcome')])[1]")
    private WebElement successLogin;

    WebElement myElement;

    public void findAndSend(String strElement, String value){

        switch (strElement){
            case "emailLogin": myElement = emailLogin; break;
            case "passwordLogin": myElement = passwordLogin; break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement){

        switch (strElement){
            case "signInMenuBtn": myElement = signInMenuBtn; break;
            case "signInBtn": myElement = signInBtn; break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){

        switch (strElement){
            case "successLogin": myElement = successLogin; break;
        }
        verifyContainsText(myElement,text);
    }

}
