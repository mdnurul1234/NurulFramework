package searchHomePage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class AllCatagoriFind extends CommonAPI {
    String homepageUrl = "https://www.ebay.com/";
    @FindBy(xpath = "//*[@id=\"gh-cat-box\"]")
    WebElement selectAll;

    @FindBy(xpath = "//*[@id=\"gh-cat\"]/option")
    List<WebElement> listAllItem;

    public void clickAllcatagoriList()throws Exception {
        Select select = new Select(selectAll);
        for (int i = 0; i < listAllItem.size(); i++) {
            select.deselectByIndex(i);
            Thread.sleep(2000);
        }
    }
}




































