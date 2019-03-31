package testTitelPage;

import base.CommonAPI;
import facebookHomePage.Gamesbutton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOnGamesPage extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    Gamesbutton homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,Gamesbutton.class);
    }
    @Test
    public void testOnGames(){
        this.homepage.clickOngames();
    }
}
