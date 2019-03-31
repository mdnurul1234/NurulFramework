package testTitelPage;

import base.CommonAPI;
import facebookHomePage.PrivacyBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnPrivacyButton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    PrivacyBar homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,PrivacyBar.class);
    }
    @Test
    public void testOnprivacyBar(){
        this.homepage.clickOnPrivacyButton();
    }
}
