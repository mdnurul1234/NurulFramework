package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-p-5\"]/a")
    WebElement ordersButton;
    public void ordersBar(){
        this.ordersButton.click();
    }

}
