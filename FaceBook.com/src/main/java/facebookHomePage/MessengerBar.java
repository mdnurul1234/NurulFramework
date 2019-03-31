package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessengerBar extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_l\"]/ul/li[3]/a")
    WebElement messengerButton;
    public void clickOnMessengerBar(){
        this.messengerButton.click();
    }
}
