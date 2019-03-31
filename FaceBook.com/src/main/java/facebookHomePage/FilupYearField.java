package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilupYearField extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"month\"]")
    WebElement yearFieldHomepage;
    public void clickOnyearButton(){
        this.yearFieldHomepage.click();
    }
}
