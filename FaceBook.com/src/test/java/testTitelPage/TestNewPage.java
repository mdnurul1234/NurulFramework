package testTitelPage;

import base.CommonAPI;
import facebookHomePage.ClickOnNewButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNewPage extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    ClickOnNewButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, ClickOnNewButton.class);
    }
    @Test
    public void testOnpage(){
        this.homepage.clickonNewItem();
    }
}
