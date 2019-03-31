package testTitelPage;

import base.CommonAPI;
import facebookHomePage.MonthFiledButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNewMonthBar extends CommonAPI {
   String homepageUrl="https://www.facebook.com/";
   MonthFiledButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, MonthFiledButton .class);
    }
    @Test
    public void testOnNewMonthfield(){
        this.homepage.clickOnMonthBar();
    }
}
