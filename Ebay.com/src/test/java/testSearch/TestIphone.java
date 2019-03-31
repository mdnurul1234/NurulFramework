package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchHomePage.IphoneXr;

public class TestIphone extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    IphoneXr homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,IphoneXr.class);
    }
    @Test
    public void testsearch()throws Exception{
        this.homepage.searchbtnIphone("IphoneXr");
        Thread.sleep(3000);
    }
}
