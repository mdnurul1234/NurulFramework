package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllCatagoriBar extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-cat\"]")
    WebElement AllCatagori;
    public void allCatagoriButton(){
        this.AllCatagori.click();
    }
    @FindBy(id = "gh-cart-i")
    WebElement shopingIcon;
    public void shopingChart(){
        this.shopingIcon.click();
    }
    @FindBy(xpath = "//*[@id=\"gh-cat\"]")
    WebElement IconBar;
    public void iconButton(){
        this.IconBar.click();
    }

}
