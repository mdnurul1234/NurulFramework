package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickOnLoginPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"u_0_2\"]")
    WebElement loginPageButton;
    public void clickonLoginButton()throws Exception{
        this.loginPageButton.click();
    }
}
