
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UltaTestHomePage extends CommonAPI{

    UltaHomePage ultaHomePage;
    String homePageUrl = "https://www.ulta.com/";

    @BeforeClass

    public void initialize() {
        driver.navigate().to(homePageUrl);
        ultaHomePage = PageFactory.initElements(driver, UltaHomePage.class);

    }

    @Test
    public void find() {
        driver.findElement(By.id("sign-in"));
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
    }

    @Test
    public void navigateToSignup() {
        ultaHomePage.signUpPage();
    }

    @Test
    public void navigateToMaakeUpPage() {
        ultaHomePage.makeUpPage();
    }

    @Test
    public void navigateToFIndAStore() {
        ultaHomePage.findAStore();
    }

    @Test
    public void navigateToMensPage() {
        ultaHomePage.mensPage();
    }

    @Test
    public void navigateToSkinCarePage() {
        ultaHomePage.skinCarePage();
    }

    @Test
    public void ableToSignUpForUlta() throws Exception {

        ultaHomePage.signUpForUltaBeauty();
    }


}
