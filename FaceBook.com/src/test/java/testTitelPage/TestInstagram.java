package testTitelPage;

import base.CommonAPI;
import facebookHomePage.InstragramButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestInstagram extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    InstragramButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,InstragramButton.class);
    }
    @Test
    public void testOnInstagrameOnPage(){
        this.homepage.clickOnInstragram();
    }
}
