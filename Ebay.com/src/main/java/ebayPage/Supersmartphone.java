package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Supersmartphone extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"destinations_list1\"]/ul/li[6]/a/h3")
    WebElement superSmartPhone;
    public void clicksuperSmartPhone(){
        this.superSmartPhone.click();
    }
}
