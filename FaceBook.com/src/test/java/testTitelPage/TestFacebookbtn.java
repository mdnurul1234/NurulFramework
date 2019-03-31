package testTitelPage;

import base.CommonAPI;
import facebookHomePage.Facebookbutton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFacebookbtn extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    Facebookbutton homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,Facebookbutton.class);
    }
    @Test
    public void testFacebookItemBtn(){
        this.homepage.facebookHomePage();
    }
}
