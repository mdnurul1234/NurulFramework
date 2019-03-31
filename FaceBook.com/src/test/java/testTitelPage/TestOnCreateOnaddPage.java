package testTitelPage;

import base.CommonAPI;
import facebookHomePage.Createonadd;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnCreateOnaddPage extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    Createonadd homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,Createonadd.class);
    }
    @Test
    public void clickOnCreatePage(){
        this.homepage.clickOnPageCreateAdd();
    }
}
