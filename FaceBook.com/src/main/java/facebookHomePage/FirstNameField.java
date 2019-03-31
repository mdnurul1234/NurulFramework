package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstNameField extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"u_0_c\"]")
    WebElement firstNameBtn;
    public void clickOnFirstName(){
        this.firstNameBtn.click();
    }
}
