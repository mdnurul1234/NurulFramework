package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpAndContact extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-p-1\"]/a")
    WebElement helpAndContact;
    public void helpandContactButton(){
        this.helpAndContact.click();
    }

}
