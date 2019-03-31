package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestGamingLaptop extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"destinations_list1\"]/ul/li[3]/a/h3")
    WebElement bestgaminglaptop;
    public void clickBestGmaingLaptop(){
        this.bestgaminglaptop.click();
    }
}
