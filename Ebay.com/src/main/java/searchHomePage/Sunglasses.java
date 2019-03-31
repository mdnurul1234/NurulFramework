package searchHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sunglasses extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement newSunglasses;
    public void clikSunglassesItem(String text){
        this.newSunglasses.sendKeys(text, Keys.ENTER);
    }
}
