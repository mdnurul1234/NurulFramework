package TestLoginOnPage;

import base.CommonAPI;
import loginPage.LoginPageButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestonPage extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    LoginPageButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, LoginPageButton.class);
    }
    @Test
    public void testOnPageButton(){
        this.homepage.clickOnTakeYourShot();
    }
}
