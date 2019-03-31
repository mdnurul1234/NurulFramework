package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[1]/span")
    WebElement homebar;
    public void homePageBar(){
        this.homebar.click();
    }
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a")
    WebElement saveBar;
    public void saveBarIcon(){
        this.saveBar.click();
    }
}
