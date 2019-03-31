package testTitle;

import base.CommonAPI;
import ebayPage.EbayHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    EbayHomePage homePage;
    String homePageUrl = "https://www.ebay.com/";

    @BeforeMethod
    public void initialize() {
        driver.get(homePageUrl);
        homePage = PageFactory.initElements(driver, EbayHomePage.class);
        driver.navigate().to(this.homePageUrl);
        driver.getTitle();
    }

    @Test
    public void testUserHomePage() {
        String homePageTitle = driver.getTitle();
        //String homePageurlTitle="Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
        this.driver.navigate().to(this.homePageUrl);
        Assert.assertEquals(homePageTitle, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
    }
    @Test
    public void testsearchbar1() {
        this.driver.navigate().to(this.homePageUrl);
        this.homePage.searchbar();
    }

    @Test
    public void testShopBybar() throws Exception {
        this.driver.navigate().to(this.homePageUrl);
        this.homePage.shopByBar();
        Thread.sleep(5000);
    }

}
