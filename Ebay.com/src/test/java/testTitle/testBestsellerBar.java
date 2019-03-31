package testTitle;

import base.CommonAPI;
import ebayPage.TheBestSell;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testBestsellerBar extends CommonAPI {
    String hpmePageurl="https://www.ebay.com/";
    TheBestSell homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(hpmePageurl);
        this.homePage= PageFactory.initElements(driver,TheBestSell.class);
        this.driver.manage().window().maximize();
    }
    @Test
    public void TestBestSellerButoon() throws Exception{
        this.homePage.theBestSellerItem();
        Thread.sleep(3000);
    }
}



