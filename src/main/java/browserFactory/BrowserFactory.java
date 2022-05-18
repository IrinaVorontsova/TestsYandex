package browserFactory;
import enums.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public static void main(String[] args) {
        System.out.println(1);
     /*   ChromeOptions options = new ChromeOptions();
        System.out.println(2);
        options.addArguments("--lang=" + Constants.LANGUAGE);
        System.out.println(3);
        WebDriverManager.chromedriver().setup();
        System.out.println(4);
        WebDriver wd = new ChromeDriver(options);*/

        WebDriver wd = getBrowserType("CHROME");
        System.out.println(2);
       // wd.manage().timeouts().getImplicitWaitTimeout();

        System.out.println(3);
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wd.manage().window().maximize();
        wd.navigate().to("http://yandex.ru");

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement LOGO = wd
                .findElement(By.xpath("//*[@class='home-link home-logo__link']"));
        System.out.println(LOGO.getAttribute("href"));
        System.out.println(LOGO.getAttribute("href").equals("https://yandex.ru/"));
        System.out.println("test finished");

        wd.quit();

     /*   ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang= " + Constants.LANGUAGE);
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //TestCase1 open URL
        driver.navigate().to("http://yandex.ru");*/


    }
}