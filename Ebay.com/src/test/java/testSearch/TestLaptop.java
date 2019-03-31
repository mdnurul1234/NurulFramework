package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchHomePage.LaptopSearch;


public class TestLaptop extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
 LaptopSearch homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,LaptopSearch.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.searchbtn("Laptop");
        Thread.sleep(3000);
    }
}
