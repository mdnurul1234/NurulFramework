package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindPeopleButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[6]/a")
    WebElement newPeopleBar;
    public void clikcOnPeopleItem(){
        this.newPeopleBar.click();
    }
}
