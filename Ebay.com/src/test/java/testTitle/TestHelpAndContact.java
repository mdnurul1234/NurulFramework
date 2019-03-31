package testTitle;

import base.CommonAPI;
import ebayPage.HelpAndContact;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHelpAndContact extends CommonAPI {
    String homePageurl= "https://www.ebay.com/";
    HelpAndContact homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePageurl);
        this.homePage= PageFactory.initElements(driver,HelpAndContact.class);
    }
    @Test
    public void testContactHelpBar(){
        this.driver.navigate().to(this.homePageurl);
        this.homePage.helpandContactButton();
    }
}
