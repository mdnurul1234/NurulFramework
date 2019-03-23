
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UltaTestHomePage extends CommonAPI{

    UltaHomePage ultaHomePage;
    String homePageUrl = "https://www.ulta.com/";

    @BeforeMethod

    public void initialize() {
        driver.navigate().to(homePageUrl);
        ultaHomePage = PageFactory.initElements(driver, UltaHomePage.class);

    }

    @Test
    public void getTitle(){
        driver.getTitle();
        String title = "Cosmetics, Fragrance, Skincare and Beauty Gifts | Ulta Beauty";
        Assert.assertEquals(driver.getTitle(), title);
    }


    @Test
    public void enterSearchBox() {
        ultaHomePage.enterInSearchBox("Fragrance");
        String urlExpected = "https://www.ulta.com/fragrance?N=26wa";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToSalesPage() throws Exception {
        ultaHomePage.salesPage();
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/promotion/buy-more-save-more/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);

    }


    @Test
    public void navigateToSignIn() {
        ultaHomePage.signInPage();
        String urlExpected = "https://www.ulta.com/ulta/myaccount/login.jsp";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToSignup() {
        ultaHomePage.signUpPage();
        String urlExpected = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToMakeUpPage() {
        ultaHomePage.makeUpPage();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToFIndAStore() {
        ultaHomePage.findAStore();
        String urlExpected = "https://www.ulta.com/stores/#/?q=&z=4&c=37.09020000000001%2C-95.71289999999999\n";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToMensPage() {
        ultaHomePage.mensPage();
        String urlExpected = "https://www.ulta.com/promotion/buy-more-save-more/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToSkinCarePage() {
        ultaHomePage.skinCarePage();
        String urlExpected = "https://www.ulta.com/men?N=26zq";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void ableToSignUpForUltaThroughSticky() throws Exception {

        ultaHomePage.signUpForUltaBeauty();
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);

    }


}
