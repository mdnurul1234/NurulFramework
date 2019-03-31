package testTitle;

import base.CommonAPI;
import ebayPage.BuyBtn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBuyButton extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    BuyBtn homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,BuyBtn.class);
    }
    @Test
    public void testAllFashionbatn()throws Exception{
        this.homepage.clickBuyButton();
        Thread.sleep(3000);
    }
}
