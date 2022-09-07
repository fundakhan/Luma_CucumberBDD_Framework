package POM;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class BasePOM {

    static WebDriverWait wait;

    public void sendKeysFunction(WebElement element, String value){
/** 3. asama parent in cagrilan fonksiyonu */
        waitUntilVisible(element); // gozukene kadar bekle
        scrollToElement(element);   // elemente scroll yap
        element.clear();       // input kutucugunu temizle
        element.sendKeys(value);          // degeri gonder


    }

    public void waitUntilVisible(WebElement element){

        // beklemeyi yap
        wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element){

        // elemente kadar kaydirmayi yap
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public void clickFunction(WebElement element){

        waitUntilClickable(element);  // clickable olana kadar bekle
        scrollToElement(element);     // kaydirmayi yap
        element.click();              // click yap


    }

    public void waitUntilClickable(WebElement element){

        // element clickable olana kadar beklemeyi yap
        wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void verifyContainsText(WebElement element, String text){

        waitUntilVisible(element);  // gozukene kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

    public void waitUntilLoading(){
        wait = new WebDriverWait(BaseDriver.getDriver(),Duration.ofSeconds(20));

        //fuse-progress-bar in child lari 0 olana kadar bekle methodu
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"),0));
    }

    public static void delay(int second) {
        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public  void listSelectOption(WebElement element,String value){
        clickFunction(element);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public int randomIndexForList(List<WebElement> list){
        return (int) (Math.random() * list.size());
    }

    public void clickRandomFromAList(List<WebElement> list){
        list.get(randomIndexForList(list)).click();
    }
}
