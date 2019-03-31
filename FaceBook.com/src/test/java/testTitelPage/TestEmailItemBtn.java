package testTitelPage;

import base.CommonAPI;
import facebookHomePage.ClickEmailBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEmailItemBtn extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    ClickEmailBar homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,ClickEmailBar.class);
        //this.driver.getTitle();
    }
    @Test
    public void testEmailbutton(){
        this.homepage.clickemailItemBtn();
    }
}
