package testTitle;

import base.CommonAPI;
import ebayPage.GetTheCupon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGetTheCupon extends CommonAPI {
    String homePageUrl="https://www.ebay.com/";
    GetTheCupon homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePageUrl);
        this.homepage= PageFactory.initElements(driver,GetTheCupon.class);
    }
    @Test
    public void testGetTheCupon(){
        this.homepage.getTheCuponButton();
    }
}
