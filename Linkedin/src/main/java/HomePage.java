import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(css = "#reg-firstname")
    WebElement firstNameInput;

    @FindBy(css = "#reg-lastname")
    WebElement lastNameInput;

    @FindBy(css = "#reg-email")
    WebElement emailInput;

    @FindBy(css = "#reg-password")
    WebElement passwordInput;

    @FindBy(id = "registration-submit")
    WebElement registerButton;

    @FindBy(className = "reg-alert")
    WebElement alert;

    public void inputFirstName(String fName){
        firstNameInput.sendKeys(fName);
    }

    public void inputLastName(String lName){
        lastNameInput.sendKeys(lName);
    }

    public void inputEmail(String email){
        emailInput.sendKeys(email);
    }

    public void inputPassword(String passWord){
        passwordInput.sendKeys(passWord);
    }

    public void submitRegistration(){
        registerButton.click();
    }

    public String alertText(){
        boolean alertMsg = alert.isDisplayed();
        System.out.println(alert.getText());
        Assert.assertTrue(alertMsg);
        String expectedAlert = "";

        return expectedAlert ;
    }
}
