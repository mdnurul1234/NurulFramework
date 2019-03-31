package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchHomePage.PopcornMachine;

public class testPopCronMachones extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
      PopcornMachine homepage;
     @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,PopcornMachine.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.clickSearchBar("popcron machines");
        Thread.sleep(2000);
    }
}
