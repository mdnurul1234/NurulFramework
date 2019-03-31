package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchHomePage.SearchHoney;

public class TestNewItem extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    SearchHoney homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,SearchHoney.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.clickSearchitem("Honey");
        Thread.sleep(2000);
    }
}
