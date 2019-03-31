package testTitle;

import base.CommonAPI;
import ebayPage.MusicButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMusicItem extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    MusicButton homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver, MusicButton.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.clickMusicItem();
        Thread.sleep(2000);
    }
}
