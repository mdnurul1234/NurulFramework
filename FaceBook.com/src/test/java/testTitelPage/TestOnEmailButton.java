package testTitelPage;

import base.CommonAPI;
import facebookHomePage.InputEmailBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnEmailButton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    InputEmailBar homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, InputEmailBar .class);
    }
    @Test
    public void testInputEmailButton(){
        this.homepage.clickOnEmailButton();
    }
}
