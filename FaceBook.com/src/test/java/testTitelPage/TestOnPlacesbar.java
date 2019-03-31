package testTitelPage;

import base.CommonAPI;
import facebookHomePage.placesButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnPlacesbar extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    placesButton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,placesButton.class);
    }
    @Test
    public void clickOnPlacesbuttton(){
        this.homepage.clickOnPlaces();
    }
}
