package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-ug-flex\"]/a")
    WebElement clickregister;
    public void registerbar(){
        this.clickregister.click();
    }
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[13]/a")
    WebElement underSell;
    public void under10(){
        this.underSell.click();
    }

}
