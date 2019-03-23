import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UltaSignUpPage {

    @FindBy(id ="first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "zipcode")
    WebElement zipCode;

    @FindBy(id = "mobile_number_1")
    WebElement cellNumBox1;

    @FindBy(id = "mobile_number_2")
    WebElement cellNumBox2;

    @FindBy(id = "mobile_number_3")
    WebElement cellNumBox3;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(linkText = "Mobile Terms & Conditions")
    WebElement termsAndConditions;

    @FindBy(linkText = "Privacy Policy")
    WebElement privacyPolicy;

    public void enterFirstName(String enterFirstName){
        firstName.sendKeys(enterFirstName);
    }

    public void enterLastName(String enterLastName){
        lastName.sendKeys(enterLastName);
    }

    public void enterEmail(String enterEmail){
        email.sendKeys(enterEmail);
    }

    public void enterZipCode(String enterZipCode){
        zipCode.sendKeys(enterZipCode);
    }

    public void enterCellBox1(String first3Numbers){
        cellNumBox1.sendKeys(first3Numbers);
    }

    public void enterCellBox2(String second3Numbers){
        cellNumBox1.sendKeys(second3Numbers);
    }

    public void enterCellBox3(String last4Numbers){
        cellNumBox1.sendKeys(last4Numbers);
    }

    public void clickSubmit(){
        submitButton.click();
    }

    public void seeTermsAndConditions(){
        termsAndConditions.click();
    }

    public void seePrivacyPolicy(){
        privacyPolicy.click();
    }

}
