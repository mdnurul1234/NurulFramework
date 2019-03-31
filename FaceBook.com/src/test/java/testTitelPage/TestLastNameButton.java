package testTitelPage;

import base.CommonAPI;
import facebookHomePage.FirstNameField;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLastNameButton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    FirstNameField homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, FirstNameField .class);
    }
    @Test
    public void testLastNameButton(){
        this.homepage.clickOnFirstName();
    }
}
