package testTitle;

import base.CommonAPI;
import ebayPage.RegisterButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRegister extends CommonAPI {
    RegisterButton homePage;
    String homePageUrl = "https://www.ebay.com/";
    @BeforeMethod
    public void initialize(){
        driver.get(homePageUrl);
        homePage = PageFactory.initElements(driver,RegisterButton.class);
    }
    @Test
  public void testRegister(){this.driver.navigate().to(this.homePageUrl);
    this.homePage.registerbar();
    }
    @Test
    public void testUnder()throws Exception{
        this.homePage.under10();
        Thread.sleep(5000);
    }

}
