package testTitle;

import base.CommonAPI;
import ebayPage.QuestionIcon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestQuestionIcon extends CommonAPI {
    String homePageurl="https://www.ebay.com/";
    QuestionIcon homePage;
    @BeforeMethod
    public void initialize(){
        this.driver.get(homePageurl);
        this.homePage= PageFactory.initElements(driver, QuestionIcon.class);
        this.driver.manage().window().maximize();
    }
    @Test
    public void testQuestionBar(){
        this.homePage.questionSingIcon();
    }

}
