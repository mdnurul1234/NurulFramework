package testTitelPage;

import base.CommonAPI;
import facebookHomePage.CareersButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnCareers extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
     CareersButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, CareersButton.class);
    }
    @Test
    public void testOnCareers(){
        this.homepage.clickOnCareers();
    }
}
