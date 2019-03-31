package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLife extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[4]/a")
    WebElement facebooklifeButton;
    public void clickOnfacebooklife(){
        this.facebooklifeButton.click();
    }
}
