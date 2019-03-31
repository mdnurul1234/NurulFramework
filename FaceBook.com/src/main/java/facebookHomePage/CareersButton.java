package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[22]/a")
    WebElement careersOnpage;
    public void clickOnCareers(){
        this.careersOnpage.click();
    }
}
