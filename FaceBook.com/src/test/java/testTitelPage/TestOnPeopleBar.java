package testTitelPage;

import base.CommonAPI;
import facebookHomePage.FindPeopleButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnPeopleBar extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    FindPeopleButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,FindPeopleButton.class);
    }
    @Test
    public void testOnPeopleButton(){
        this.homepage.clikcOnPeopleItem();
    }

}
