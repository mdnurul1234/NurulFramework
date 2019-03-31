package testTitle;

import base.CommonAPI;
import ebayPage.DailyDeals;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDaily extends CommonAPI {
    DailyDeals homePage;
    String homePageUrl = "https://www.ebay.com/";

    @BeforeMethod
    public void initialize(){
        driver.get(homePageUrl);
        homePage = PageFactory.initElements(driver,DailyDeals.class);
    }
    @Test
    public void TestDailyDeals(){
        this.homePage.dealsHomePage();
    }

}
