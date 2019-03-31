package testTitelPage;

import base.CommonAPI;
import facebookHomePage.MessengerBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMessengerButton extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    MessengerBar homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, MessengerBar.class);
    }
    @Test
    public void testOnMessengerBarOnpage()throws Exception{
        this.homepage.clickOnMessengerBar();
        Thread.sleep(2000);
    }
}
