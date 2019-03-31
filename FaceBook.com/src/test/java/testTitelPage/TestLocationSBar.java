package testTitelPage;

import base.CommonAPI;
import facebookHomePage.LocationsButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLocationSBar extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    LocationsButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,LocationsButton.class);
    }
    @Test
    public void testOnLocationOnPage(){
        this.homepage.clickOnLocations();
    }
}
