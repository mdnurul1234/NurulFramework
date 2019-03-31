package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindFriendsBar extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[5]/a")
    WebElement findFriendsButton;
    public void clickOnFindFriends(){
        this.findFriendsButton.click();
    }
}
