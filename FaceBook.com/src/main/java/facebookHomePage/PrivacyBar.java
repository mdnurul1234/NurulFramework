package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyBar extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[23]/a")
    WebElement privacyButton;
    public void clickOnPrivacyButton(){
        this.privacyButton.click();
    }
}
