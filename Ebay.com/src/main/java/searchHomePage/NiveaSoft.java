package searchHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NiveaSoft extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement clickSearchButton;
    public  void SearchBarItem(String text){
        this.clickSearchButton.sendKeys(text, Keys.ENTER);
    }
}
