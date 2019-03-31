package testTitle;

import base.CommonAPI;
import ebayPage.HomeButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePageBar extends CommonAPI {
    String homePageUrl="https://www.ebay.com/";
    HomeButton homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(this.homePageUrl);
        this.homePage= PageFactory.initElements(driver,HomeButton.class);
        this.driver.manage().window().maximize();
    }
    @Test
    public void testHomePageIcon(){
        this.homePage.homePageBar();
    }
    @Test
    public void testSaveBarIcon(){
        this.homePage.homePageBar();
    }
}
