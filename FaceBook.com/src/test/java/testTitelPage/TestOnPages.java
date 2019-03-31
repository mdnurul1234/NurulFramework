package testTitelPage;

import base.CommonAPI;
import facebookHomePage.PagesButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnPages extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    PagesButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,PagesButton.class);
    }
    @Test
    public void testOnPageButtton(){
            this.homepage.clickOnPages();
    }
}
