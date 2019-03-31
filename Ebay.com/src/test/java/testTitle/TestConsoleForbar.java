package testTitle;

import base.CommonAPI;
import ebayPage.ConsolesFor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestConsoleForbar extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    ConsolesFor homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,ConsolesFor.class);
        this.driver.manage().window().maximize();
    }
    @Test
    public void testConsolesForIcon() throws Exception{
        this.homepage.consolesForIcon();
        Thread.sleep(2000);
    }
}
