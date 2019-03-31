package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingIn extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement SingInButton;
    public void singInBar(){
        this.SingInButton.click();
    }

}
