package searchHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShampooItem extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement shampooitemList;
    public void clickShampooItem(String text){
        this.shampooitemList.sendKeys(text, Keys.ENTER);
    }
}
