package ebayPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetTheCupon {
    @FindBy(xpath = "//*[@id=\"rtm_list2\"]/div[2]/div/a")
    WebElement getTheCuponBar;
    public void getTheCuponButton(){
        this.getTheCuponBar.click();
    }
}
