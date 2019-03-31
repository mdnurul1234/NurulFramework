package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpButtonClass extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_2\"]/ul/li[29]/a")
    WebElement helpbuttononPage;
    public void clickonHelpButton(){
        this.helpbuttononPage.click();
    }
}
