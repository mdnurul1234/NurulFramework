package testTitelPage;

import base.CommonAPI;
import facebookHomePage.AboutButtounOnPage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.DataReader;

public class TestAboutOnPage extends CommonAPI {
    DataReader excelData = new DataReader();
    String path ="C:\\Users\\Md Nurul Islam\\IdeaProjects\\WebAutomationGroup3\\FaceBook.com\\src\\test\\resources\\ExcelFile.xls";
    String homepageUrl="https://www.facebook.com/";
    AboutButtounOnPage homepage;
    @BeforeMethod
    public void initialize() {
        this.driver.get(homepageUrl);
        this.homepage = PageFactory.initElements(driver,AboutButtounOnPage.class);
    }
    @Test
    public void testOnAboutOnpage(){
        this.homepage.clickOnAboutOnpage();
    }
    @Test
    public void testSearchAndNavigateUsingKeywordDriven() throws Exception {
        ///TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] testSteps = excelData.fileReader3(path, 0);
        for (String str : testSteps) {
            switch (str) {
                case "search":
                    testOnAboutOnpage();
                    break;
                case "navigate":
                    testOnAboutOnpage();
                    break;
                default:
                    throw new InvalidArgumentException("Invalid choice");
            }
            System.out.println(str);
        }
    }

}
