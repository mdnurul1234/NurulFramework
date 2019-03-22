import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSqlDBSearch extends CommonAPI {




   String homeUrl = "https://www.ulta.com/";
   SearchWithDB searchWithDB;
   @BeforeClass
   public void init(){
       driver.navigate().to(homeUrl);
       searchWithDB = PageFactory.initElements(driver,SearchWithDB.class);
   }

   @Test
    public void testSearchDB()throws Exception{
       searchWithDB.searchItemsOfDB();
   }



}
