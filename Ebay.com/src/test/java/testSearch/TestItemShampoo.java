package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchHomePage.ShampooItem;

public class TestItemShampoo extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    ShampooItem homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,ShampooItem.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.clickShampooItem("Aveeno Shampoo");
        Thread.sleep(2000);
    }
}
