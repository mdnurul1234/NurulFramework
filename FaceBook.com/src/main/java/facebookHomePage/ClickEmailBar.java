package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickEmailBar extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailabutton;
    public void clickemailItemBtn(){
        this.emailabutton.click();
    }
}
