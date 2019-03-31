package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotorsButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
    WebElement motorsBar;
    public void clickMotors(){
        this.motorsBar.click();
    }
}
