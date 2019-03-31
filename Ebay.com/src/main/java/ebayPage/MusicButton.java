package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MusicButton extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a")
    WebElement musicItemlist;
    public void clickMusicItem(){
        this.musicItemlist.click();
    }
}
