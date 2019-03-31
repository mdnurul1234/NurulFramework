package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilesButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[7]/a")
    WebElement profilesItem;
    public void clickOnProfiles(){
        this.profilesItem.click();
    }
}
