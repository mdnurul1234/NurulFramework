package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElectronicItem extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    ElectronicItem homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,ElectronicItem.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.clickElectronicBtn();
        Thread.sleep(3000);
    }
}
