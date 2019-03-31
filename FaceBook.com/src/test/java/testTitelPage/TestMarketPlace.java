package testTitelPage;

import base.CommonAPI;
import facebookHomePage.MarketPlaceButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMarketPlace extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    MarketPlaceButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, MarketPlaceButton.class);
    }
    @Test
    public void testOnMarketPlace(){
        this.homepage.clickOnMarketplace();
    }
}
