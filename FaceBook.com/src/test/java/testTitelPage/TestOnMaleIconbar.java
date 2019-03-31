package testTitelPage;

import base.CommonAPI;
import facebookHomePage.ClickOnIconMale;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnMaleIconbar extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    ClickOnIconMale homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, ClickOnIconMale.class);
    }
    @Test
    public void testOnmaleiconbar(){
        this.homepage.clickOnMaleIconBar();
    }


        }
