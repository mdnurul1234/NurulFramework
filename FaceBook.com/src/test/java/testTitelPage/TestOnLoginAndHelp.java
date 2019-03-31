package testTitelPage;

import base.CommonAPI;
import facebookHomePage.LoginandHelp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnLoginAndHelp extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    LoginandHelp homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, LoginandHelp.class);
    }
    @Test
    public void testOnLoginAndhelp(){
        this.homepage.clickOnLoginHelp();
    }
}
