import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage homePage;
    String homePageUrl = "https://www.linkedin.com/";

    @BeforeMethod
    public void initialize(){
        driver.get(homePageUrl);
        homePage = PageFactory.initElements(driver,HomePage.class);

    }

    @Test
    public void enterFirstName(){
        homePage.inputFirstName("Selenium");
    }

    @Test
    public void enterLastName(){
        homePage.inputLastName("Test");
    }

    @Test
    public void enterEmail(){
        homePage.inputEmail("stest7380@gmail.com");
    }

    @Test
    public void enterPassword(){
        homePage.inputPassword("stest312@t");
    }

    @Test
    public void registerButton(){
        homePage.submitRegistration();
    }

    @Test(priority = 6)
    public void registerForLinkedIn() throws Exception{
        enterFirstName();
        enterLastName();
        enterEmail();
        enterPassword();
        registerButton();
        Thread.sleep(4000);
//        String urlExpected = "https://www.linkedin.com/onboarding/start/profile-location/new/";
//        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);

    }

    @Test
    public void registerWithNoLastName() throws Exception{
        enterFirstName();
        enterEmail();
        enterPassword();
        registerButton();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your last name";
        Assert.assertEquals(homePage.alert.getText(), expectedAlert);
    }

    @Test
    public void registerWithNoEmail() throws Exception{
        enterFirstName();
        enterLastName();
        enterPassword();
        registerButton();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your email address";
        Assert.assertEquals(homePage.alert.getText(), expectedAlert);

    }
    @Test
    public void registerWithNoPassword() throws Exception{
        enterFirstName();
        enterLastName();
        enterEmail();
        registerButton();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your password";
        Assert.assertEquals(homePage.alert.getText(), expectedAlert);

    }

    @Test
    public void registerWithNoCredentials() throws Exception{
        registerButton();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your first name";
        Assert.assertEquals(homePage.alert.getText(), expectedAlert);
    }


}
