package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class QuestionIcon extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"i-faq\"]")
    WebElement QuestionButton;

    public void questionSingIcon(){
        this.QuestionButton.click();

    }
}
