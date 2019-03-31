package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheBestSell extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"destinations_list1\"]/div/div/div/h2")
    WebElement theBestSellBar;
    public void theBestSellerItem(){
        this.theBestSellBar.click();
    }
}
