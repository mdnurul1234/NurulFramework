package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlartBar extends CommonAPI {
    @FindBy(id = "gh-Alerts-i")
    WebElement aleart;
    public void aleartIconBar(){
        this.aleart.click();
    }
}
