import Helpers.Methods;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TestLogin extends Methods {

    @Test
    public void ducksCorrectLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("sergei.moroz94test@gmail.com", "123123");

        HomePage homePage = new HomePage(driver);
    }
}
