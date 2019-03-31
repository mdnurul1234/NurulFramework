package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterEmail extends CommonAPI {
      @FindBy(xpath = "//*[@id=\"email\"]")
      WebElement enterEmailAddress;
      @FindBy(xpath = "//*[@id=\"pass\"]")
      WebElement enterPasswordBar;
      @FindBy(xpath = "//*[@id=\"u_0_2\"]")
      WebElement loginButton;
//      @FindBy(xpath = "//*[@id=\"userNavigationLabel\"]")
//      WebElement newIconBsr;
    public void clickEnterEmailAddress(String userName)throws Exception{
        this.enterEmailAddress.sendKeys(userName);
    }
    public void psswordfield(String password){
        this.enterPasswordBar.sendKeys(password);
    }
    public void clickOnLoginbar(){
        this.loginButton.click();
    }
//    public void clickOnIcon(){
//        this.newIconBsr.click();
//    }

}
