import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UltaTestMakeUpPage extends UltaMakeUpPage {

    UltaMakeUpPage ultaMakeUpPage;
    String makeupPageUrl ="https://www.ulta.com/makeup?N=26y1";

    @BeforeMethod
    public void initialize(){
        driver.get(makeupPageUrl);
        ultaMakeUpPage = PageFactory.initElements(driver, UltaMakeUpPage.class);
    }

    @Test
    public void chooseNewArrival1stFrame() throws Exception{
        ultaMakeUpPage.setMacPallete();
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void chooseNewArrival2ndFrame(){
        ultaMakeUpPage.setTarteFaceTape();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void chooseBestSeller1(){
        ultaMakeUpPage.setBestSeller1stframe();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void lipsSection1stFrame(){
        ultaMakeUpPage.setLipsSection1stFrame();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    @Test
    public void makeUp3rdFrame(){
        ultaMakeUpPage.setFaceMakeUp3rdFrame();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void eyeMakeUp2ndFrame(){
        ultaMakeUpPage.setEyeMakeUp2ndFrame();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    @Test
    public void verifyLogo(){
        ultaMakeUpPage.verifyLogoImg();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    @Test

    public void hoverShopByBrand() throws InterruptedException{
        hoverShopByBrands();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test

    public void hoverNChoose() throws InterruptedException{
        hoverNChooseFromBrands();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

}
