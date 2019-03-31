package testTitle;

import base.CommonAPI;
import ebayPage.AllCatagoriBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAllCatagoriBar extends CommonAPI {
    String homepageurl="https://www.ebay.com/";
    AllCatagoriBar homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homepageurl);
        this.homePage= PageFactory.initElements(driver,AllCatagoriBar.class);
        this.driver.manage().window().maximize();
    }
    @Test
    public void TestAllCatagoriButton(){
        this.homePage.allCatagoriButton();
    }
    @Test
    public void TestShopingChartButton(){
        this.homePage.shopingChart();
    }
    @Test
    public void TesticonBar(){
        this.homePage.iconButton();
    }
}
