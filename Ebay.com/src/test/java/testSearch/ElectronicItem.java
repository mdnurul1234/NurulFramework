package testSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicItem extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    WebElement electronicList;
    public void clickElectronicBtn(){
        this.electronicList.click();
    }
}
