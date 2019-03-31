package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagesButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[8]/a")
    WebElement clickpagesBar;
    public void clickOnPages(){
        this.clickpagesBar.click();
    }
}
