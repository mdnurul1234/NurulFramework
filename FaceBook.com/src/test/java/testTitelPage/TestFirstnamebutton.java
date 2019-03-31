package testTitelPage;

import base.CommonAPI;
import facebookHomePage.FirstNameField;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFirstnamebutton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    FirstNameField homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, FirstNameField .class);
    }
    @Test
    public void testFirstNameItem() throws Exception{
        this.homepage.clickOnFirstName();
        Thread.sleep(2000);
    }
}
