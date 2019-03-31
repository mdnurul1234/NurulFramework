package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickPassswordField extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement password;
    public void clickPasswordItem(){
        this.password.click();
    }
}
