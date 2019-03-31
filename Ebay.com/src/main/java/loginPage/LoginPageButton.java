package loginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"rtm_list2\"]/div[2]/div/a/div[2]")
    WebElement takeYourShot;
    public void clickOnTakeYourShot(){
        this.takeYourShot.click();
    }
}
