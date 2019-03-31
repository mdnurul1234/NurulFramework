package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickOnNewButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"birthday-help\"]")
    WebElement clickonnewPage;
    public void clickonNewItem(){
        this.clickonnewPage.click();
    }
}
