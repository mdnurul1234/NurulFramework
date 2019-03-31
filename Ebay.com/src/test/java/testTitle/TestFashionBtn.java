package testTitle;

import base.CommonAPI;
import ebayPage.MouseOverFashion;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFashionBtn extends CommonAPI {
    String homepageUrl="https://www.ebay.com/b/Fashion/bn_7000259856";
    MouseOverFashion homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,MouseOverFashion.class);
    }
    @Test
    public void testAllFashionbatn()throws Exception{
        this.homepage.clickAllFashionBtn();
        Thread.sleep(3000);
    }
}
