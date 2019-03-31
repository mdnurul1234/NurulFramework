package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstragramButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[15]/a")
    WebElement instragramOnpage;
    public void clickOnInstragram(){
        this.instragramOnpage.click();
    }
}
