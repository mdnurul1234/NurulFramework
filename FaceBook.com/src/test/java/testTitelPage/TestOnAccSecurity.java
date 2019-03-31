package testTitelPage;

import base.CommonAPI;
import facebookHomePage.AccountSecurity;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnAccSecurity extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    AccountSecurity homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, AccountSecurity.class);
    }
    @Test
    public void testOnAccountSecurityButton(){
        this.homepage.clickOnAccountSecurity();
    }
}
