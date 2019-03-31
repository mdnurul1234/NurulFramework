package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutButtounOnPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[18]/a")
    WebElement aboutOnpage;
    public void clickOnAboutOnpage(){
        this.aboutOnpage.click();
    }
}
