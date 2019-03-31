package testTitle;

import base.CommonAPI;
import ebayPage.Sell;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSell extends CommonAPI {
    String homePagrUrl="https://www.ebay.com/";
    Sell homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePagrUrl);
        this.homePage= PageFactory.initElements(driver, Sell.class);
    }
    @Test
    public void testSell() throws Exception{
        this.driver.navigate().to(this.homePagrUrl);
        this.homePage.sellButton();
        Thread.sleep(5000);
    }

}
