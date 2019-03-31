package testTitelPage;

import base.CommonAPI;
import facebookHomePage.LocalOnpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnLocalPage extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    LocalOnpage homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, LocalOnpage.class);
    }
    @Test
    public void testOnLocal(){
        this.homepage.clickOnLocal();
    }
}
