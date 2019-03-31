package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftsCard extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-p-1\"]/a")
    WebElement giftsAndCard;
    public void giftAndCardBar(){
        this.giftsAndCard.click();
    }
}
