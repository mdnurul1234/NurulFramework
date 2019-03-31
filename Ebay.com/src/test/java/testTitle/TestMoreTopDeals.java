package testTitle;

import base.CommonAPI;
import ebayPage.MoreTopDeals;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMoreTopDeals extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    MoreTopDeals homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,MoreTopDeals.class);
    }
    @Test
    public void testMoreTopDealsButton(){
        this.homepage.moreTopDealsBar();
    }
}
