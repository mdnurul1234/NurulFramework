package searchHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphoneXr extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement searchBtn;
    public void searchbtnIphone(String text){
        this.searchBtn.sendKeys(text, Keys.ENTER);
    }
}
