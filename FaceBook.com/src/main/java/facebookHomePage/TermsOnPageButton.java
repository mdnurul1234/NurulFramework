package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsOnPageButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[26]/a")
    WebElement clickOnTerms;
    public void clickOntermsBar(){
        this.clickOnTerms.click();
    }
}
