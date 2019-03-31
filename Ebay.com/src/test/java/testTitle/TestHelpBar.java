package testTitle;

import base.CommonAPI;
import ebayPage.HelpIcon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHelpBar extends CommonAPI {
    String homePageUrl="https://www.ebay.com/";
    HelpIcon homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePageUrl);
        this.homePage= PageFactory.initElements(driver,HelpIcon.class);
    }
    @Test
    public void TestHelpButton()throws Exception{
        this.homePage.helpIconBar();
        Thread.sleep(3000);
    }
}
