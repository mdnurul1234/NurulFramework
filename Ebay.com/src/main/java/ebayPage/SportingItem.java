package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportingItem extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a")
    WebElement sportingGoodBtn;
    public void clickSportigItem(){
        this.sportingGoodBtn.click();
    }
}
