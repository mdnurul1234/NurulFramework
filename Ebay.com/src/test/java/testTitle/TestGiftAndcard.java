package testTitle;

import base.CommonAPI;
import ebayPage.GiftsCard;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGiftAndcard extends CommonAPI {
    String homePageUrl="https://www.ebay.com/";
    GiftsCard homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePageUrl);
        this.homePage= PageFactory.initElements(driver,GiftsCard.class);
    }
    @Test
    public void testGiftCardbutton(){
        this.driver.navigate().to(this.homePageUrl);
        this.homePage.giftAndCardBar();
    }
}
