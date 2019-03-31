package testTitle;

import base.CommonAPI;
import ebayPage.AlartBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAleart extends CommonAPI {
    String homePageUrl="https://www.ebay.com/";
    AlartBar homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePageUrl);
        this.homePage= PageFactory.initElements(driver,AlartBar.class);
    }
    @Test
    public void testAlartButton(){
        this.driver.navigate().to(this.homePageUrl);
        this.homePage.aleartIconBar();
    }
}
