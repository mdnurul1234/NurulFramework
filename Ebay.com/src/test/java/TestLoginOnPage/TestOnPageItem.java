package TestLoginOnPage;

import base.CommonAPI;
import loginPage.DaysOndailysel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnPageItem extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    DaysOndailysel homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, DaysOndailysel.class);
    }
    @Test
    public void testOnNewPageItem(){
        this.homepage.clickOnDailySelldays();
    }
}
