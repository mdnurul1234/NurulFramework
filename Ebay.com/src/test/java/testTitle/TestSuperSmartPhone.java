package testTitle;

import base.CommonAPI;
import ebayPage.Supersmartphone;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSuperSmartPhone extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    Supersmartphone homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,Supersmartphone.class);
    }
    @Test
    public void testSmatPhoneBarClick(){
        this.homepage.clicksuperSmartPhone();
    }
}
