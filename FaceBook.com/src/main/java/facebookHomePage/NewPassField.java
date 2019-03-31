package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPassField extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"u_0_o\"]")
    WebElement newpasswordButton;
    public void clickOnNewpasswordBar(){
        this.newpasswordButton.click();
    }
}
