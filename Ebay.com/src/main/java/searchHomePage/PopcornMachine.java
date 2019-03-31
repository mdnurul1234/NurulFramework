package searchHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopcornMachine extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement popCornMachinesItem;
    public void clickSearchBar(String text){
        this.popCornMachinesItem.sendKeys(text, Keys.ENTER);
    }
}
