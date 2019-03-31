package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage extends CommonAPI {
    String homePageUrl = "https://www.ebay.com/";

//    @FindBy(css = "#reg-firstname")
//    WebElement firstNameInput;
//
//    @FindBy(css = "#reg-lastname")
//    WebElement lastNameInput;
//
//    public void inputFirstName(String fName){
//        firstNameInput.sendKeys(fName);
//    }
//
//    public void inputLastName(String lName){
//        lastNameInput.sendKeys(lName);
//    }


    @FindBy(id = "gh-btn")
    private WebElement selectSearch;
    public void searchbar() {
        this.selectSearch.click();
    }
    @FindBy(id="gh-shop-a")
    private WebElement shopBybar;
    public void shopByBar() throws Exception{
        this.shopBybar.click();
        Thread.sleep(4000);
    }
}
