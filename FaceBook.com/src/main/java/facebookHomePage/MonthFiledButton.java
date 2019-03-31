package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MonthFiledButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"month\"]")
    WebElement newMonthBar;
    public void clickOnMonthBar(){
        this.newMonthBar.click();
    }
}
