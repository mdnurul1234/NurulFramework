package testTitelPage;

import base.CommonAPI;
import facebookHomePage.ProfilesButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnProfiles extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
     ProfilesButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,ProfilesButton.class);
    }
    @Test
    public void testOnProfiles(){
        this.homepage.clickOnProfiles();
    }
}
