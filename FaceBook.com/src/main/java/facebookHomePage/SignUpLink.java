package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpLink extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"u_0_u\"]")
    WebElement signupButton;
    public void clickOnSignup(){
        this.signupButton.click();
    }

}
