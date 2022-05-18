package browserFactory;
import enums.Constants;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BrowserWork {
    private static WebDriver driver;
    private static BrowserWork browserWork;

    private BrowserWork(){
    }

    public static BrowserWork getInstance(){
        if(browserWork == null){
            browserWork = new BrowserWork();

        }
        return browserWork;
    }

    public WebDriver getDriver() {
        return driver = BrowserFactory.getBrowserType(Constants.BROWSER);
    }

  /*  public void maximize(){
      //  driverWait();
        getDriver().manage().window().maximize();
    }
    public void toNavigate(String path){
      //  driverWait();
        getDriver().navigate().to(path);
    }

    public void quit(){
        getDriver().quit();
    }

    public void driverWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }*/

}

