package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlaceButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[13]/a")
    WebElement marketplaceOnpage;
    public void clickOnMarketplace(){
        this.marketplaceOnpage.click();
    }
}
