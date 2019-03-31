package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationsButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[12]/a")
    WebElement locationButtonOnPage;
    public void clickOnLocations(){
        this.locationButtonOnPage.click();
    }
}
