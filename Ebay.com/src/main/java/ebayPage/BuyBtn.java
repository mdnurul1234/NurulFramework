package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyBtn extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/h3/a")
    WebElement buybuttonBar;
    public void clickBuyButton(){
        this.buybuttonBar.click();
    }


}
