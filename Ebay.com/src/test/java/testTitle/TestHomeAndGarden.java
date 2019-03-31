package testTitle;

import base.CommonAPI;
import ebayPage.HomeAndGarden;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomeAndGarden extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
   HomeAndGarden homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver, HomeAndGarden.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.clickHomeandGarden();
        Thread.sleep(2000);
    }
}