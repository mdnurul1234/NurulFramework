package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEbay extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-eb-My\"]/div/a[1]")
    WebElement myEbayBar;
    public void homePageMyEbay(){
        this.myEbayBar.click();
    }
}
