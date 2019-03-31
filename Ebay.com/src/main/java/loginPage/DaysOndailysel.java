package loginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DaysOndailysel extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"rtm_list2\"]/div[1]/div/div[1]/a/h2")
    WebElement dailySellByDays;
    public void clickOnDailySelldays(){
        this.dailySellByDays.click();
    }
}
