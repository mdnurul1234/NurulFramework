package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevelopersOnPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[21]/a")
    WebElement developresonButton;
    public void clickOndevelopers(){
        this.developresonButton.click();
    }
}
