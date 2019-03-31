package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputEmailBar extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"u_0_h\"]")
    WebElement emailorPhoneButton;
    public void clickOnEmailButton(){
        this.emailorPhoneButton.click();
    }
}
