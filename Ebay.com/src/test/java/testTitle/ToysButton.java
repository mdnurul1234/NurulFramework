package testTitle;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToysButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")
    WebElement toysitemBtntemBtn;
    public void setToysitemBtn() {
        this.toysitemBtntemBtn.click();
    }
}
