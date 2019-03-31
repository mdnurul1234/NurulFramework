package testTitle;

import base.CommonAPI;
import ebayPage.BestGamingLaptop;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBestGamingLaptop extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    BestGamingLaptop homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,BestGamingLaptop.class);
    }
    @Test
    public void testBestgamingLaptopClick(){
        this.homepage.clickBestGmaingLaptop();
    }
}
