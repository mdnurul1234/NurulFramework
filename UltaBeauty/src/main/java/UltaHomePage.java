
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UltaHomePage {

    @FindBy(css = "#searchInput")
    WebElement searchBox;

    @FindBy(linkText = "EMAIL SIGNUP")
    WebElement signUp;

    @FindBy(linkText = "SALES & COUPONS")
    WebElement salesPage;

    @FindBy(linkText = "FIND A STORE")
    WebElement findStorePage;

    @FindBy(id = "sign-in")
    WebElement signInPage;

    @FindBy(linkText = "MAKEUP")
    WebElement makeUpPage;

    @FindBy(linkText = "MEN")
    WebElement mensPage;

    @FindBy(linkText = "SKIN CARE")
    WebElement skinCarePage;

    @FindBy(id = "firstName")
    WebElement firstNameStickySignUp;

    @FindBy(id = "lastName")
    WebElement lastNameStickySignUp;

    @FindBy(xpath = "//input[@name='emailaddress']")
    WebElement emailStickySignUp;

    @FindBy(className = "StickyEmailSignUp__submit--signup--msg")
    WebElement submitInStickySignUp;



    public void findAStore(){
        findStorePage.click();
    }

    public void signInPage(){
        signInPage.click();
    }

    public void signUpPage(){
        signUp.click();
    }

    public void mensPage(){
        mensPage.click();
    }

    public void enterInSearchBox(String search){
        searchBox.sendKeys(search, Keys.ENTER);

    }

    public void salesPage(){
        salesPage.click();
    }

    public void makeUpPage(){
        makeUpPage.click();
    }

    public void skinCarePage(){
        skinCarePage.click();
    }

    public void signUpForUltaBeauty(){
        firstNameStickySignUp.sendKeys("Sylvana");
        lastNameStickySignUp.sendKeys("Rahman");
        emailStickySignUp.sendKeys("stest7380@gmail.com");
        submitInStickySignUp.click();
    }
}
