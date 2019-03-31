package loginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpoilYourself extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"rtm_list3\"]/div/div/div[2]/a/div[2]")
    WebElement spoilYourselfButton;
    public void clickOnSpoilyourSelf(){
        this.spoilYourselfButton.click();
    }
}
