package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpIcon extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"ocs-inflow\"]/h3")
    WebElement helpIconButton;
    public void helpIconBar(){
        this.helpIconButton.click();
    }
}
