package testTitle;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestToysItem extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    ToysButton homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver, ToysButton.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.setToysitemBtn();
        Thread.sleep(2000);
    }
}
