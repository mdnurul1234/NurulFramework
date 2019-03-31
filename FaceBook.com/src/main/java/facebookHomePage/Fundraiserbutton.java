package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fundraiserbutton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[17]/a")
    WebElement fundrasierbar;
    public void clickOnFundrasierOnPage(){
        this.fundrasierbar.click();
    }
}
