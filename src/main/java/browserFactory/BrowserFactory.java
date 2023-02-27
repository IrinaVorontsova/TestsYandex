package browserFactory;
import enums.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


public class BrowserFactory {
    public static WebDriver getBrowserType(String browser){
        switch (browser){
            case "CHROME":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--lang=" + Constants.LANGUAGE);
                WebDriverManager.chromedriver().setup();

                return new ChromeDriver();

            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();

                FirefoxOptions firefoxOptions = new FirefoxOptions();
                FirefoxProfile firefoxProfile = new FirefoxProfile();
                firefoxProfile.setPreference("intl.accept_languages", Constants.LANGUAGE);
                firefoxOptions.setProfile(firefoxProfile);

                return new FirefoxDriver();

            default: {
                throw new RuntimeException("Incorrect BrowserName");
            }

        }

    }
}