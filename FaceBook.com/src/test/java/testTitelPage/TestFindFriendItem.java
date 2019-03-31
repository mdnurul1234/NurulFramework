package testTitelPage;

import base.CommonAPI;
import facebookHomePage.FindFriendsBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFindFriendItem extends CommonAPI {
    String homepageUrl="https://www.facebook.com/";
    FindFriendsBar homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver, FindFriendsBar.class);
    }
    @Test
    public void testOnFindFriends(){
        this.homepage.clickOnFindFriends();
    }
}
