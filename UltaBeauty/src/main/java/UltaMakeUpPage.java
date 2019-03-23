import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UltaMakeUpPage extends CommonAPI {

    @FindBy(css = "#pimprod2004212")
    WebElement newArrival1stFrame;

    @FindBy(css = "#pimprod2003933")
    WebElement newArrival2ndFrame;

    @FindBy(css = "#xlsImpprod14291015")
    WebElement bestSeller1stframe;

    @FindBy(css = "#xlsImpprod13631033")
    WebElement lipsSection1stFrame;


    @FindBy(css = "#xlsImpprod18121011")
    WebElement faceMakeUp3rdFrame;

    @FindBy(css = "#xlsImpprod17731247")
    WebElement eyeMakeUp2ndFrame;

    @FindBy(xpath = "//*[@id=\'show-deskmob-con\']/a/img")
    WebElement UltaBeautyLogo;

//    @FindBy(xpath = "//*[@id=\'hide-desk-nav\']/div[2]/ul/li[4]/a")
//    WebElement shopByBrand;
//
//    @FindBy(xpath = "//*[@id=\'hide-desk-nav\']/div[2]/ul/li[4]/div/div/div/div[1]/ul[1]/li[5]/a")
//    WebElement macBrand;

    public void setMacPallete(){
        newArrival1stFrame.click();
    }

    public void setTarteFaceTape(){
        newArrival2ndFrame.click();
    }

    public void setBestSeller1stframe(){
        bestSeller1stframe.click();
    }

    public void setLipsSection1stFrame(){
        lipsSection1stFrame.click();
    }

    public void setFaceMakeUp3rdFrame(){
        faceMakeUp3rdFrame.click();
    }

    public void setEyeMakeUp2ndFrame(){
        eyeMakeUp2ndFrame.click();
    }

    public void verifyLogoImg(){
        boolean ultaImg = UltaBeautyLogo.isDisplayed();
        System.out.println(UltaBeautyLogo.getText());
        Assert.assertTrue(ultaImg);

    }

    public void hoverShopByBrands() throws InterruptedException{

        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/a");
        Thread.sleep(5000);

    }

    public void hoverNChooseFromBrands() throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/div/div/div/div[3]/ul/li[1]/a/img")).click();
    }



}
