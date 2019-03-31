package searchHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThermoFlask extends CommonAPI {
    @FindBy(xpath =  "//*[@id=\"gh-ac\"]")
    WebElement thermoFlaskItem;
    public void clickthermoFlask(String text){
        this.thermoFlaskItem.sendKeys(text, Keys.ENTER);
    }
}
