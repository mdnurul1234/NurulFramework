package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gamesbutton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[11]/a")
    WebElement gamesOnPage;
    public void clickOngames(){
        this.gamesOnPage.click();

    }
}
