package testTitelPage;

import base.CommonAPI;
import facebookHomePage.TermsOnPageButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnTermsBar extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
   TermsOnPageButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,TermsOnPageButton.class);
    }
    @Test
    public void testOntermsbar(){
        this.homepage.clickOntermsBar();
    }
}
