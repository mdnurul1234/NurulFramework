package testTitelPage;

import base.CommonAPI;
import facebookHomePage.IconOnFemale;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestIconBar extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    IconOnFemale homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,IconOnFemale.class);
      }
      @Test
    public void testOnIconButton(){
        this.homepage.clickOniconbar();
      }

  }

