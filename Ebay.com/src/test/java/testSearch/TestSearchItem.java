package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchHomePage.Sunglasses;

public class TestSearchItem extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    Sunglasses homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,Sunglasses.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.clikSunglassesItem("GreenSunglasses");
        Thread.sleep(2000);
    }
}
