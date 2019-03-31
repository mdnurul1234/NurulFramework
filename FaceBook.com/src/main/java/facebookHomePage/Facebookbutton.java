package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebookbutton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
    WebElement facebookbutton;
    public void facebookHomePage(){
        this.facebookbutton.click();
    }
}
