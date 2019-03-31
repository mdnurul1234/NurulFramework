package testTitelPage;

import base.CommonAPI;
import facebookHomePage.DateFieldBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDayButtomOnPage extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    DateFieldBar homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,DateFieldBar .class);
    }
    @Test
    public void testOnDayButton(){
        this.homepage.clickOnDayButton();
    }
}
