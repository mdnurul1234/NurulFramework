package searchHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHoney extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement honeyItem;
    public void clickSearchitem(String text){
        this.honeyItem.sendKeys(text, Keys.ENTER);
    }
}
