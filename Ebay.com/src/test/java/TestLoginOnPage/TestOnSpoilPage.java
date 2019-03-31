package TestLoginOnPage;

import base.CommonAPI;
import loginPage.SpoilYourself;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnSpoilPage extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    SpoilYourself homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, SpoilYourself.class);
    }
    @Test
    public void testOnSpoilPage(){
        this.homepage.clickOnSpoilyourSelf();
    }
}
