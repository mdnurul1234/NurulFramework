package testTitelPage;

import base.CommonAPI;
import facebookHomePage.FilupYearField;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnYearbar extends CommonAPI {
    String homepageUrl = "https://www.facebook.com/";
    FilupYearField homepage;

    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, FilupYearField.class);
    }
    @Test
    public void testOnYearButtonOnPage(){
        this.homepage.clickOnyearButton();

    }
}
