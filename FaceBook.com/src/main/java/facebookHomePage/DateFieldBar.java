package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DateFieldBar extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"day\"]")
    WebElement dayItem;
    public void clickOnDayButton(){
        this.dayItem.click();
    }
}
