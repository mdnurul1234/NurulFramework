package testTitle;

import base.CommonAPI;
import ebayPage.SingIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSing extends CommonAPI {
    SingIn homePage;
    String homePageUrl = "https://www.ebay.com/";

    @BeforeMethod
    public void initialize(){
        driver.get(homePageUrl);
        homePage = PageFactory.initElements(driver,SingIn.class);
    }
    @Test
    public void testSingIn()throws Exception{
        this.driver.navigate().to(this.homePageUrl);
        this.homePage.singInBar();
        Thread.sleep(6000);
    }

}
