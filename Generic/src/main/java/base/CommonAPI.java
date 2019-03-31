package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;
    //@Parameters({"url"})
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Nurul Islam\\IdeaProjects\\WebAutomationGroup3\\Generic\\browser-driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).build().perform();
            //action.moveToElement( driver.findElement( By.xpath( "//div[@class='hl-cat-nav__sub-cat-col']/ul/li[3]" ) ));
            //Thread.sleep(1500);
            //action.click().build().perform();
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }
    @AfterClass
    public void cleanUp(){
      driver.quit();
//       this.driver.close();
    }
}
