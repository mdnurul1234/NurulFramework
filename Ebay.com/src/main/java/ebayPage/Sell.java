package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sell extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-p-2\"]/a")
    WebElement SellBar;
    public void sellButton(){
        this.SellBar.click();
    }
}
