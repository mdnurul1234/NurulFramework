package testTitelPage;

import base.CommonAPI;
import facebookHomePage.EnterEmail;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignInPage extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    EnterEmail homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, EnterEmail.class);
    }
    @Test
    public void testEnterEmailAddress() throws Exception {
        this.homepage.clickEnterEmailAddress("nurul4079@gmail.com");
        this.homepage.psswordfield("Md123456");
        this.homepage.clickOnLoginbar();
       // this.homepage.clickOnIcon();
        Thread.sleep(2000);
    }
}
