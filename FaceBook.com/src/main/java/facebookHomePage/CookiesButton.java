package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CookiesButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[24]/a")
    WebElement cookiesBar;
    public void clickOnCookies(){
        this.cookiesBar.click();
    }
}
