package testTitle;

import base.CommonAPI;
import ebayPage.OrdersPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOrders extends CommonAPI {
    String homePageUrl="https://www.ebay.com/";
    OrdersPage homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePageUrl);
        this.homePage= PageFactory.initElements(driver, OrdersPage.class);
    }
    @Test
    public void testOrders(){
        this.driver.navigate().to(this.homePageUrl);
        this.homePage.ordersBar();
    }
}
