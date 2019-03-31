package testTitelPage;

import base.CommonAPI;
import facebookHomePage.SignUpLink;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignuplinkButton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    SignUpLink homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, SignUpLink.class);
    }
    @Test
    public void testOnSignuplink()throws Exception{
        this.homepage.clickOnSignup();
        Thread.sleep(2000);
    }
}
