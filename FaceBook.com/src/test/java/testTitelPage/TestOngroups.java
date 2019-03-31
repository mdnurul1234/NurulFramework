package testTitelPage;

import base.CommonAPI;
import facebookHomePage.GroupsButtton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOngroups extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    GroupsButtton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, GroupsButtton.class);
    }
    @Test
    public void testOngroupsOnpage(){
        this.homepage.clickOngroups();
    }
}
