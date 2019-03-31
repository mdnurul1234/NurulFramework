package testTitelPage;

import base.CommonAPI;
import facebookHomePage.NewPassField;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNewpasswordFiled extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    NewPassField homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,NewPassField .class);
    }
    @Test
    public void testOnNewPassbar(){
        this.homepage.clickOnNewpasswordBar();
    }
}
