package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DailyDeals extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-p-1\"]/a")
    WebElement dailyDeals;
    public void dealsHomePage(){
        this.dailyDeals.click();
    }
}
