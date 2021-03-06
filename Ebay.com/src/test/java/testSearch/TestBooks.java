package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchHomePage.BooksItem;

public class TestBooks extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    BooksItem homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,BooksItem.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.searchbtn("Books");
        Thread.sleep(3000);
    }
}
