package testTitle;

import base.CommonAPI;
import ebayPage.SportingItem;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSportingButton extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    SportingItem homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver, SportingItem.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.clickSportigItem();
        Thread.sleep(2000);
    }
}
