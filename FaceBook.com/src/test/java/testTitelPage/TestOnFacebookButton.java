package testTitelPage;

import base.CommonAPI;
import facebookHomePage.FacebookLife;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnFacebookButton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    FacebookLife homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, FacebookLife.class);
    }
    @Test
    public void testOnfacebookbuttoin(){
        this.homepage.clickOnfacebooklife();
    }
}
