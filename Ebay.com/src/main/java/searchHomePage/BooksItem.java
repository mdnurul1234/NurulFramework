package searchHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksItem extends CommonAPI {
    String homepageUrl="https://www.ebay.com/";
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement search;
    public void searchbtn(String text){
        this.search.sendKeys(text, Keys.ENTER);
    }
}
