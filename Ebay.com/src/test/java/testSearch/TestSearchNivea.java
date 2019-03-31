package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchHomePage.NiveaSoft;

public class TestSearchNivea extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    NiveaSoft homepage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageUrl);
        this.homepage= PageFactory.initElements(driver,NiveaSoft.class);
    }
    @Test
    public void testSearchBtn() throws Exception{
        this.homepage.SearchBarItem("nivea soft");
        Thread.sleep(2000);
    }
}
