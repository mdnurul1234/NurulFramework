package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LastnameField extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"u_0_e\"]")
    WebElement lastnamePage;
    public void clickOnlastNamebar(){
        this.lastnamePage.click();
    }
}
