package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IconOnFemale extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"u_0_9\"]")
    WebElement femaleIconBar;
    public void clickOniconbar(){
        this.femaleIconBar.click();
    }
}
