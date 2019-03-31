package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginandHelp extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[28]/a")
    WebElement loginandhelpButton;
    public void clickOnLoginHelp(){
        this.loginandhelpButton.click();
    }
}
