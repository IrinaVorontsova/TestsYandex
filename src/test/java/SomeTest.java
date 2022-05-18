import browserFactory.BrowserWork;
import enums.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import somePages.SearchPage;

public class SomeTest extends BaseTest{


    @Test
    public void testCase(){
        SearchPage searchPage = new SearchPage();
        WebDriver web = BrowserWork.getInstance().getDriver();

        web.manage().window().maximize();
        web.navigate().to(Constants.PATH);

        Assert.assertTrue(searchPage.isPageCorrect(web), "This page is not yandex");


    }

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    //    SearchPage searchPage = new SearchPage();
       // String YANDEX = "https://yandex.ru/";
       // Assert.assertTrue(searchPage.isPageCorrect(), "This page is not yandex");
       // Assert.assertEquals(YANDEX, searchPage.logoPage(), "This page is not yandex");


       // baseTest.tearDown();
    }
}
