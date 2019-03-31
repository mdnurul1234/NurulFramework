package testTitle;

import base.CommonAPI;
import ebayPage.MotorsButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMotors extends CommonAPI  {
    String homepageUrl="https://www.ebay.com/";
    MotorsButton homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,MotorsButton.class);
    }
    @Test
    public void testClickMotors() throws Exception{
        this.homepage.clickMotors();
        Thread.sleep(2000);
    }
}
