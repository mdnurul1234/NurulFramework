package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeAndGarden extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a")
    WebElement homeAndGardenBtn;
    public void clickHomeandGarden(){
        this.homeAndGardenBtn.click();
    }
}
