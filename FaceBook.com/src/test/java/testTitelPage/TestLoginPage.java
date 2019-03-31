package testTitelPage;

import base.CommonAPI;
import facebookHomePage.ClickOnLoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginPage extends CommonAPI {

    String homepageUrl="https://www.facebook.com/";
    ClickOnLoginPage homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, ClickOnLoginPage .class);
    }
    @Test
    public void testOnLoginPage()throws Exception{
        this.homepage.clickonLoginButton();
        Thread.sleep(2000);
    }
}
