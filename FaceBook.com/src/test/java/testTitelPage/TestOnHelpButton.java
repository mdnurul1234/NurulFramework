package testTitelPage;

import base.CommonAPI;
import facebookHomePage.HelpButtonClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnHelpButton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    HelpButtonClass homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, HelpButtonClass.class);
    }
    @Test
    public void testOnHelpbar(){
        this.homepage.clickonHelpButton();
    }
}
