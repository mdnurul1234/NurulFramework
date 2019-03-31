package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSecurity extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[27]/a")
    WebElement accountSecurityBar;
    public void clickOnAccountSecurity(){
        this.accountSecurityBar.click();
    }
}
