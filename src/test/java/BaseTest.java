import browserFactory.BrowserWork;
import enums.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import somePages.SearchPage;

import java.time.Duration;

public class BaseTest {

  //  @BeforeMethod
    public void setUp(){
      // BrowserWork.getInstance().toNavigate((Constants.PATH));
     //  BrowserWork.getInstance().maximize();

        BrowserWork.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowserWork.getInstance().getDriver().manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
      // BrowserWork.getInstance().quit();
    }

}
