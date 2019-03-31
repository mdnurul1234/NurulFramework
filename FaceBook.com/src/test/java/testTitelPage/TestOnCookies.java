package testTitelPage;

import base.CommonAPI;
import facebookHomePage.CookiesButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnCookies extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    CookiesButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,CookiesButton.class);
    }
    @Test
    public void testOnCookies(){
        this.homepage.clickOnCookies();
    }
}
