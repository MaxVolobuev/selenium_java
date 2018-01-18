
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoggedInUserManPage;
import utils.InitPageElements;
import utils.Navigation;
import utils.WebDriverManager;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

//Тест на логин
public class FacebookLoginTest {


    @BeforeMethod
    public void beforeEachtests(){
        WebDriverManager.openBrowser();
    }


    @Test
    public void successFacebookLoginTest(){
      LoggedInUserManPage loggedInUserManPage = Navigation.openFacebookMainPage().submitForCredentials("maxvolobuev@icloud.com", "90gepard");
      assertTrue(loggedInUserManPage.isSearchFieldPresent());

    }

    @AfterMethod
    public void afterEachTest(){
        WebDriverManager.closeBrowser();
    }
}
