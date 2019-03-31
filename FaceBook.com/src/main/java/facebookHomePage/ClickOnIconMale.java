package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickOnIconMale extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"u_0_a\"]")
    WebElement iconMaleButton;
    public void clickOnMaleIconBar(){
        this.iconMaleButton.click();
    }
}
