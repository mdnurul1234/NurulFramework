package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class placesButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[10]/a")
    WebElement placesOnPage;
    public void clickOnPlaces(){
        this.placesOnPage.click();
    }
}
