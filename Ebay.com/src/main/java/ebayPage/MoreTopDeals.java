package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoreTopDeals extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"destinations_list1\"]/ul/li[7]/a/h3")
    WebElement moreTopDealsItem;
    public void moreTopDealsBar(){
        this.moreTopDealsItem.click();
    }
}
