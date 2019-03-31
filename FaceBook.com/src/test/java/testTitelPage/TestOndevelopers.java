package testTitelPage;

import base.CommonAPI;
import facebookHomePage.DevelopersOnPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOndevelopers extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    DevelopersOnPage homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, DevelopersOnPage.class);
    }
    @Test
    public void testOndevelopers(){
        this.homepage.clickOndevelopers();
    }
}
