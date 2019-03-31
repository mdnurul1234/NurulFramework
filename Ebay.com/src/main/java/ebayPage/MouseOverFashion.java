package ebayPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MouseOverFashion extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]//a")
//            public void navigatehomepage(){
//        this.driver.navigate().to(clickAllFashionBtn());
//    }
            List<WebElement> FashionBtnList;
    public void clickAllFashionBtn()throws Exception{
        for(WebElement element :FashionBtnList){
           element.click();
           Thread.sleep(3000);
        }
    }
}
