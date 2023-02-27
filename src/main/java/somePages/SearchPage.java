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

    public void searchText(WebDriver web, String text){
        web.findElement(SEARCH_TEXT).sendKeys(text);
        web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        web.findElement(SEARCH_BUTTON).click();
    }
    //*[@class='home-link home-logo__link']
    //*[@id='text']
    //*[@class='search2__button']/button

    /*WebElement element = driver.findElement(By.xpath("//*[@class='example']/h3"));
        Assert.assertEquals("Infinite */

}
