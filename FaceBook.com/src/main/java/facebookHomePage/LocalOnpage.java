package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocalOnpage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[16]/a")
    WebElement localonPage;
    public void clickOnLocal(){
        this.localonPage.click();
    }
}
