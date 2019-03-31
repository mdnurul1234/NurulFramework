package testTitle;

import base.CommonAPI;
import ebayPage.MyEbay;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMyEbay extends CommonAPI {
    String homePageurl="https://www.ebay.com/";
    MyEbay homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePageurl);
        this.homePage= PageFactory.initElements(driver, MyEbay.class);
    }
    @Test
    public void testMyEbay() throws Exception{
        this.driver.navigate().to(this.homePageurl);
        this.homePage.homePageMyEbay();
        Thread.sleep(4000);
    }
}
