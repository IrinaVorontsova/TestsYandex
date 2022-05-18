package somePages;

import browserFactory.BrowserWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SearchPage {
    private static final By LOGO = By.xpath("//*[@class='home-link home-logo__link']");
    private static final By SEARCH_TEXT = By.id("text");
    private static final By SEARCH_BUTTON = By.xpath("//*[@class='search2__button']/button");

    private static final String YANDEX = "https://yandex.ru/";

    public boolean isPageCorrect(WebDriver web){
         web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         return web
                 .findElement(LOGO).getAttribute("href").equals(YANDEX);
     }
    public String logoPage(WebDriver web){
        web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement logo = web
                .findElement(LOGO);

        return logo.getAttribute("href");
    }

    //*[@class='home-link home-logo__link']
    //*[@id='text']
    //*[@class='search2__button']/button

    /*WebElement element = driver.findElement(By.xpath("//*[@class='example']/h3"));
        Assert.assertEquals("Infinite */

}
