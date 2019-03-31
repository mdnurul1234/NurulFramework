package testTitelPage;

import base.CommonAPI;
import facebookHomePage.ClickPassswordField;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPasswordButton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    ClickPassswordField homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, ClickPassswordField .class);
    }
    @Test
    public void testonPasswordbtn() throws Exception{
        this.homepage.clickPasswordItem();
        Thread.sleep(2000);
    }
}
