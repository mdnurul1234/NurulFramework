package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createonadd extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[19]/a")
    WebElement createandAddOnpage;
    public void clickOnPageCreateAdd(){
        this.createandAddOnpage.click();
    }
}
