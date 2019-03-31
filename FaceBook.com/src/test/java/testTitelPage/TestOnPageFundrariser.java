package testTitelPage;

import base.CommonAPI;
import facebookHomePage.Fundraiserbutton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnPageFundrariser extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    Fundraiserbutton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, Fundraiserbutton.class);
    }
    @Test
    public void testOnFunderaiserButtom(){
        this.homepage.clickOnFundrasierOnPage();
    }
}
