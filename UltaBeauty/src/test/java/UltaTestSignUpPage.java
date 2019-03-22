import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UltaTestSignUpPage extends CommonAPI {

    UltaSignUpPage ultaSignUpPage;
    String signUpPageUrl = "https://pages.exacttarget.com/ulta-email-signup/";

    @BeforeClass

    public void initialize() {
        driver.navigate().to(signUpPageUrl);
        ultaSignUpPage = PageFactory.initElements(driver, UltaSignUpPage.class);

    }

    @Test
    public void testEnterFirstName() {
        ultaSignUpPage.enterFirstName("Sylvana");
    }

    @Test
    public void testEnterLastName() {
        ultaSignUpPage.enterLastName("Rahman");
    }

    @Test
    public void testEnterEmail() {
        ultaSignUpPage.enterEmail("stest1010@gmail.com");
    }

    @Test
    public void testEnterZipCode() {
        ultaSignUpPage.enterZipCode("11208");
    }

    @Test
    public void testEnterCellBox1() {
        ultaSignUpPage.enterCellBox1("347");
    }

    @Test
    public void testEnterCellBox2() {
        ultaSignUpPage.enterCellBox2("499");
    }

    @Test
    public void testEnterCellBox3() {
        ultaSignUpPage.enterCellBox3("7676");
    }

//    @Test
//    public void testClickSubmit() {
//        ultaSignUpPage.clickSubmit();
//    }

    @Test
    public void testSeeTermsAndConditions() throws Exception{
        ultaSignUpPage.seeTermsAndConditions();

    }

    @Test

    public void testSeePrivacyPolicy()throws Exception {

        ultaSignUpPage.seePrivacyPolicy();
        driver.navigate().back();
        Thread.sleep(5000);
    }


}
