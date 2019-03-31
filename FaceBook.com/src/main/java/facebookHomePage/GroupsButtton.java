package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GroupsButtton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[14]/a")
    WebElement groupsOnpage;
    public void clickOngroups(){
        this.groupsOnpage.click();
    }
}
